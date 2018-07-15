
package com.examination.portal;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.HttpSession;


public class AuthenticateLogin extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


int authenticate=0;
int userTypeFlag=5;

     

static final int Successlogin=1;
static final int Wrongpasswordlogin=2;
static final int UnknownUsernameLogin=3;
static final int normaluser=5;

    
    @Override
    public void init(ServletConfig config) throws ServletException{
super.init(config);
}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Please wait while we authenticate your credentials...</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Please wait... </h3>");
            out.println("</body>");
            out.println("</html>");
            //Thread.sleep(6000);
            //out.println(""
             //       + "<script type=\"text/javascript\">"
             //       + "document.body.innerHTML = '';"
              //      + "</script>");
            
            String Lanid="";
            String Password="";
        
        Lanid= request.getParameter("Lanid");
        Password= request.getParameter("Password");
            
        
      
 //to check authentication after verifying from database(Database part will implement through Mongo Db)
        
        if(authenticate==Successlogin)
        {
            
            
            HttpSession newUserSession = request.getSession(true);
            
            newUserSession.setMaxInactiveInterval(1800);
            newUserSession.setAttribute("Username", Lanid);
       
          
           
        }
        else if(authenticate==Wrongpasswordlogin)
        {
            out.println("Please check the password you have entered and try again...<br>");
            out.println("<br><a href=\"index.html\">Click here to try again</a>");
        }
        else if(authenticate==UnknownUsernameLogin)
        {
            out.println("The username you have entered"
                   
                    +" does not exist in our database...");
            
            out.println("<br><a href=\"index.html\">Click here to try again</a> ... OR ... "
                    + "<a href=\"register.jsp\">Click here to register</a>");
        }
           
        } 
        catch(Exception e)
        {
            out.println("Error in database");
            e.printStackTrace(out);
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
    }
}
