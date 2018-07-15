

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

  
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Finish Examination</title>
        </style>
    </head>
    <body>
    <div class="bg">
     <img src="images/rbc logo.png" alt="Title Image" align="right" height="140" width="140" style="position: absolute; top: 0; left: 20" />
        <%
        int iQuestionNo=0;
            String SelectedOption = "";
            
            HttpSession UserSession = request.getSession(false);
        Cookie[] ExamCookies = request.getCookies();
            for(int cookieCount = 0; cookieCount < ExamCookies.length; cookieCount++)
            {
                if(ExamCookies[cookieCount].getName().equals("QuestionNo"))
                {
                    iQuestionNo = Integer.parseInt(ExamCookies[cookieCount].getValue());
                }
                
            }
            
            
                
            SelectedOption = request.getParameter("OptionsRadioSelectedValue");
            String OptionName= "Question"+iQuestionNo+"SelectedOption";
            UserSession.setAttribute(OptionName, SelectedOption);
           //out.print("Selected Option is : "+SelectedOption);
            
        %>
        
        <form name="submitExam" id="submitExamNow" action="submitExamination" method="POST">
        <table border="0" cellpadding="10" style="position: absolute; top: 40%; left: 30%">
            <tr align="center">
                <td><b style="font-size: 20px">Are you sure you wish to finish the exam?</b></td>
            </tr>
            <tr align="center">
                <td>You can check your answers before submitting them.</td>
            </tr>
            <tr align="center">
                <td align ="center">
                    <a href="ExamSubmission.jsp" style="padding: 20px">
                        Submit Exam
                    </a>
                
                    <a href ="Examination.jsp" style="padding: 20px">
                        Back
                    </a>
                </td>
            </tr>
        </table>
        </form>
        </div>
    </body>
</html>
