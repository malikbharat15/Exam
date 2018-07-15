
package com.examination.portal;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterNewUser extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      System.out.println("---here----");
    	response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             out.println("<html>");
            out.println("<head>");
            out.println("<title>Please wait while we analyze your request...</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Please wait... </h2>");
           // out.println("<br><h3>Oops... it seems our registration service is currently being updated...<br>"
             //       + "We're sorry for the inconvenience.... "
               //     + "You can check back later and we'll have it all up and running again.... Thank You..!!!</h3>");
            
            
       
        
        String Name= request.getParameter("name");
        String Age = request.getParameter("Employeeid");
        String Address = request.getParameter("Role");
        String Phone = request.getParameter("phoneno");
        String Email = request.getParameter("email");
        String UserName = request.getParameter("username");
        String Password = request.getParameter("password2");
        
     
                
       //For debugging
        out.println("<h3>New User Registration Details</h3>" 
                + "---<br>");
        out.println("<br>Name"+Name);
        out.println("<br>Age"+Age);
        out.println("<br>Address "+Address);
        out.println("<br>Phone"+Phone);
        out.println("<br>Email"+Email);
        out.println("<br>Username"+UserName);
        out.println("<br>Password"+Password);
       
        out.println("<br><br><a href='index.html'>Click here to login...</a></body>");
        out.println("</html>");
        } 
        catch(Exception er)
        {
            out.println("System Internal Error"
                    + er.getMessage());
        }
        finally {            
            out.close();
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
    	System.out.println("---here--get--");
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
    	System.out.println("---here---value-");
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
