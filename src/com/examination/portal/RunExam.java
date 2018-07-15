
package com.examination.portal;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class RunExam extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int iQuestionNo=0;
            String Direction = "";
            String SelectedOption = "";
            HttpSession UserSession = request.getSession(false);
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RunExam</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RunExam at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
            Cookie[] ExamCookies = request.getCookies();
            for(int cookieCount = 0; cookieCount < ExamCookies.length; cookieCount++)
            {
                if(ExamCookies[cookieCount].getName().equals("QuestionNo"))
                {
                    iQuestionNo = Integer.parseInt(ExamCookies[cookieCount].getValue());
                }
                if(ExamCookies[cookieCount].getName().equals("MoveDirection"))
                {
                    Direction = ExamCookies[cookieCount].getValue();
                }
            }
            
            if(Direction.equals("Next"))
            {
                iQuestionNo= iQuestionNo-1;
            SelectedOption = request.getParameter("OptionsRadio");
            String OptionName= "Question"+iQuestionNo+"SelectedOption";
            UserSession.setAttribute(OptionName, SelectedOption);
            iQuestionNo++;
            }
            else if(Direction.equals("Back"))
            {
                iQuestionNo= iQuestionNo+1;
            SelectedOption = request.getParameter("OptionsRadio");
            String OptionName= "Question"+iQuestionNo+"SelectedOption";
            UserSession.setAttribute(OptionName, SelectedOption);
                iQuestionNo--;
            }
        }
            //else
            //{
           //     SelectedOption = request.getParameter("OptionsRadio");
           // String OptionName= "Question"+iQuestionNo+"SelectedOption";
           // UserSession.setAttribute(OptionName, SelectedOption);
           // response.sendRedirect("submitExamConfirmation.jsp");
           // }

        
            
     
        catch(Exception e)
        {
            e.printStackTrace(out);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        return "Short description";
    }// </editor-fold>
}
