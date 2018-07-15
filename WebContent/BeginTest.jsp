
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
body, html {
    height: 100%;
    margin: 0;
}

.bg {
   
    background-image: url(images/lightbackground.jpg);

    height: 100%; 

   and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RBC Employee-Examination</title>
        <link href="menuStyle.css" rel="stylesheet" type="text/css" />
        </style>
    </head>
    
    <body>
    <div class="bg">
     <img src="images/rbc logo.png" alt="Title Image" align="right" height="140" width="140" style="position: absolute; top: 0; left: 20" />
       <%   
HttpSession Usersession = request.getSession(false);
/* if(Usersession.getAttribute("Username") == null)
       {
   response.sendRedirect("index.html");
      
       }
else
       { */
    
%>
<br>
<br>
<br>
<br>
<br>
<br>

<h1 class="Page-Heading" align="center">RBC-Online Examination Portal</h1>  
<%
//when database connectivity will be ready//
 //out.println("<b>Welcome "+Usersession.getAttribute("Username")+"...</b>");
out.println("Welcome User1");
 
 %>
    <table border="0" width="950">
        <tr>
            <td align ="center">
        <form name="testSummary" id="testSummary" action="StartNewExam" method="POST">
        <table cellpadding ="10" cellspacing="0" border ="0" style="padding-top: 40px; border: none">
            <th colspan ="3" style="background-color: blue"><h2 style="color: #4778e3;">RBC-Examination Details</h2></th>
            <tr style="background-color: #e1e1f0">
                <td style="color: #4778e3; font-size:20px;">
                    Exam 
                </td>
                <td>:</td>
                <td>
                    <%
            String exam = "java";
                    //when database will be connected
          //  exam = request.getParameter("examListRadio");
            out.println(exam);
%>
<input type="hidden" id="ExamCode" name="ExamCode" value="<% out.print(exam); %>"/>
<input type="hidden" id="ExamName" name="ExamNamePassOn" value="<% out.print(request.getParameter("Name-"+exam)); %>"/>
                </td>
            </tr>
            <tr style="background-color: #e1e1f0">
                <td style="color: #4778e3;font-size:20px;">
                    Duration
                </td>
                <td>:</td>
                <td>
                    1 Hour
                </td>
            </tr>
            <tr style="background-color: #e1e1f0">
                <td style="color: #4778e3;font-size:20px;">
                    Total no. of Questions
                </td>
                <td>:</td>
                <td>
                    25
                </td>
            </tr>
            <tr style="background-color: #e1e1f0">
                <td style="color: #4778e3;font-size:20px;">
                    Maximum Marks
                </td>
                <td>:</td>
                <td>
                    100
                </td>
            </tr>
            <tr style="background-color: blue">
                <td colspan="3" align ="center">
                    
                <a href="ExamInstructions.jsp">
                        <img src="images/Start-Test.png" width="160" height="42" style="margin-top:10px; border: 10" /></a>
                    <a href="index.html">
                        <img src="images/Cancel-Exam-Start.png" width="160" height="42" style="margin-top:10px; border: 10" /></a>
                </td>
            </tr>
        </table>         
        </form>  
            </td>
        </tr>
    </table>
            <%
                      // }
            %>
</div>
    </body>
</html>
