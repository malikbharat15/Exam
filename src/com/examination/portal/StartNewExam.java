
package com.examination.portal;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StartNewExam extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    private static final int EXAMDURATION = 3600;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String UEID = "";
       
       
            HttpSession Usersession = request.getSession(false);
            if(Usersession.getAttribute("Username") == null)
       {
   response.sendRedirect("index.html");
      

}
else
       {
            Date date = new Date();
        long milliseconds = date.getTime();
        long StartTime = milliseconds/1000;
                
        Usersession.setAttribute("ExamID", request.getParameter("ExamCode"));
        Usersession.setAttribute("ExamName", request.getParameter("ExamNamePassOn"));
        
        UEID = UEID.concat(request.getParameter("ExamCode")+Usersession.getAttribute("UserId")+StartTime);
        Usersession.setAttribute("UEID", UEID);
        Usersession.setAttribute("StartTime",StartTime);
        Usersession.setAttribute("Alotted", EXAMDURATION);
        Cookie ExamCookie;
        ExamCookie = new Cookie("QuestionNo","1");
        response.addCookie(ExamCookie);
        for(int i=1;i<=25;i++)
        {
        String OptionName= "Question"+i+"SelectedOption";
        Usersession.setAttribute(OptionName, null);
        }
        }
       
    }

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description one";
    }// </editor-fold>
}
