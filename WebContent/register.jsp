<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>RBC-Online Exam-New User Registration</title>

<link href="login-box.css" rel="stylesheet" type="text/css" />

<script type="text/javascript"
    src="scripts/userRegistrationValidation.js">
</script>
<script type="text/javascript">
   
</script>
</head>

<body> 
<div style="padding: 10px 0 0 100px;">
<form name="registerForm" id="registerForm" method="post" action="RegisterNewUser">
<table width="100%" id="register-box">
    <tbody>
      <tr>
        <td><span style="font-family: arial; font-size: 11pt;">
<h2>Please fill the form below to register new Employee</h2>
           

            <div>
              
                  <table cellspacing="1" cellpadding="3" border="0">
                  <tbody>
                       <tr>
                      <td id="login-box-name">Name:</td>
                      <td>
                        <input type="text" class="form-login" name="name" id="txtName" onChange="validateName()" />
                        <i id="nameError"></i>
                        </td>
                    </tr>
                     <tr>
                      <td id="login-box-name">Employee Id:</td>
                      <td>
                          <input type="text" class="form-login" name="employeeid" id="txtemployeeid" onchange="validateemployeeid()"  />
                        <i id="employeeidError"></i>
                      </td>
                    </tr>
                    <tr>
                      <td id="login-box-name">Role:</td>
                      <td>
                          <input type="text" class="form-login" name="role" id="txtrole" onchange="validaterole()"  />
                      <i id="roleError"></i>
                      </td>
                    </tr>
                   <tr>
                      <td id="login-box-name">Phone No.:</td>
                      <td>
                          <input type="text" class="form-login" name="phoneno" id="txtPhone" onchange="validatePhone()"  />
                      <i id="phoneError"></i>
                      </td>
                    </tr>
                     <tr>
                      <td id="login-box-name" >Email:</td>
                      <td>
                        <input type="text" class="form-login" name="email" id="txtEmail" onchange="validateEmail()"  />
                      <i id="emailError"></i>
                      </td>
                    </tr>

                   <tr>
                      <td id="login-box-name">Username</td>
                      <td>
                          <input type="text" class="form-login" name="username" id="txtUsername" onchange="check(this.value)" />
                      <i id="usernameError"></i>
                      </td>
                    </tr>
                    <tr>
                      <td id="login-box-name">Password:</td>
                      <td>
                          <input type="password" class="form-login" id="txtPassword" name="password" />
                       <i id="passwordError"></i>
                      </td>
                    </tr>
                    <tr>
                      <td id="login-box-name">Confirm Password:</td>
                      <td>
                          <input type="password" class="form-login" name="password2" id="txtConfirmPassword" onchange="validatePassword()" />
                     <i id="confirmpasswordError"></i>
                      </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><i id="errMain"></i></td>
                    </tr>
                         <tr>
                      <td></td>
                      <td>
                          <a href="BeginTest.jsp">
                            <img src="images/register-btn.PNG" width="103" height="42" style="margin-left:0px;" /></a>
                        
                        <a href="index.html"><img src="images/cancel-btn.PNG" width="103" height="42" 

style="margin-left:10px;" /></a></td>
                    </tr>
                  </tbody>
                </table>
              </div></span></td>
      </tr>
    </tbody>
  </table>
</form>
</div>
</body>
</html>