

var PasswordFlag=0;
var UsernameFlag=0;
var employeeidFlag=0;
var NameFlag=0;
var EmailFlag=0;
var PhoneFlag=0;

var isValidEmployeeid = /^(([1]{1}[3-9]{1})|([23456789]{1}[0-9]{1}))$/;
var isValidName = /^[a-zA-Z]+(\s[a-zA-Z]+)*$/;
var isValidEmail = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var isValidPhone = /^[0-9]{7,12}$/;

function validateName()
    {
var name = document.getElementById("txtName").value;
        
        if(name=="")
        {
            document.getElementById("nameError").innerHTML="Please enter your full name here.";
            NameFlag=1;
        } 
        else if(document.getElementById("txtName").value.search(isValidName))
            {
                document.getElementById("nameError").innerHTML="Name may only contain alphabets...";
                NameFlag=1;
            }
        else
    {
        document.getElementById("nameError").innerHTML="";
        NameFlag=0;
    }
    }

function validateEmployeeid()
    {
var age = document.getElementById("txtemployeeid").value;
    if(employeeid=="")
        {
            document.getElementById("employeeidError").innerHTML="Please enter your employeeid here.";
            employeeidFlag=1;
        } 
        else if(document.getElementById("txtemployeeid").value.search(isValidEmployeeid))
            {
                document.getElementById("employeeidError").innerHTML="employeeid must be between 0 to 9";
                employeeidFlag=1;
            }
        else
    {
        document.getElementById("employeeidError").innerHTML="";
        employeeidFlag=0;
    }    

    var iemployeeid=0;
    iemployeeid = Integer.parseInt(employeeid.toString());
    if(iemployeeid>0)
        {
            document.getElementById("employeeidError").innerHTML="";
            employeeidFlag=0;
        }
else
    {
        document.getElementById("employeeidError").innerHTML="Please enter a valid employeeid...";
        employeeidFlag=1;
    }
}
    
function validateRole()
    {
var role = document.getElementById("txtrole").value;
        
        if(role=="")
        {
            document.getElementById("roleError").innerHTML="Please enter your role here.";
        }    
        else
    {
        document.getElementById("roleError").innerHTML="";
    }
    }
    
function validatePhone()
    {
var phone = document.getElementById("txtPhone").value;
        
        if(phone=="")
        {
            document.getElementById("phoneError").innerHTML="Please enter a valid Phone no.";
            PhoneFlag=1;
        }
        else if(document.getElementById("txtPhone").value.search(isValidPhone))
            {
                document.getElementById("phoneError").innerHTML="Phone no. must be 7 to 12 digits long";
                PhoneFlag=1;
            }
        else
    {
        document.getElementById("phoneError").innerHTML="";
        PhoneFlag=0;
    }
    }
    
function validateEmail()
    {
        var email = document.getElementById("txtEmail").value;
        
        if(email=="")
        {
            document.getElementById("emailError").innerHTML="Please enter a valid Email ID";
            EmailFlag=1;
        }
        else if(document.getElementById("txtEmail").value.search(isValidEmail))
            {
                document.getElementById("emailError").innerHTML="Please enter a valid Email ID...";
                EmailFlag=1;
            }
        else
    {
        document.getElementById("emailError").innerHTML="";
        EmailFlag=0;
    }
    }
    
function validatePassword()
    {
        //var password ="";
        //var confirmPassword = "";
        
        var password = document.getElementById("txtPassword").value;
        var confirmPassword = document.getElementById("txtConfirmPassword").value;
        
        if(password != confirmPassword)
        {
            document.getElementById("passwordError").innerHTML="The passwords do not match!!";//+password+" >> "+confirmPassword.toString();
            document.getElementById("txtPassword").value="";
            document.getElementById("txtConfirmPassword").value="";
            PasswordFlag=1;
        }
        else
        {
            document.getElementById("passwordError").innerHTML="";
            PasswordFlag=0;
        }
    }
    
function registerUser()
    {
        var name = document.getElementById("txtName").value;
        var age = document.getElementById("txtemployeeid").value;
        var address = document.getElementById("txtAddress").value;
        var phone = document.getElementById("txtPhone").value;
        var email = document.getElementById("txtEmail").value;
        var username = document.getElementById("txtUsername").value;
        var password = document.getElementById("txtPassword").value;
        var confirmPassword = document.getElementById("txtConfirmPassword").value;
        
        if(name=="")
            {
                document.getElementById("errMain").innerHTML="Name field may not be left blank...!!";
            }
            else if(employeeid=="")
                {
                    document.getElementById("errMain").innerHTML="employeeid field may not be left blank...!!";
                }
                else if(role=="")
                    {
                        document.getElementById("errMain").innerHTML="role field may not be left blank...!!";
                    }
                    else if(phone=="")
                    {
                        document.getElementById("errMain").innerHTML="Phone No. field may not be left blank...!!";
                    }
                    else if(email=="")
                    {
                        document.getElementById("errMain").innerHTML="Email ID field may not be left blank...!!";
                    }
        else if(username=="")
          {
              document.getElementById("errMain").innerHTML="Username field may not be left blank...!!";
          }
          else if(UsernameFlag==1)
              {
                  document.getElementById("errMain").innerHTML="The username you entered has already been taken...";
              }
        else if(PasswordFlag==1)
            {
                document.getElementById("errMain").innerHTML="Please check the password you have entered...";
            }
        else if(password == "")
            {
                document.getElementById("errMain").innerHTML="Password may not be left blank...!!";
            }
            else if(confirmPassword == "")
            {
                document.getElementById("errMain").innerHTML="Please confirm the password you have entered...";
            }
            else if(AgeFlag==1)
                {
                    document.getElementById("errMain").innerHTML="Please check the employeeid you have entered...";
                }
                else if(PhoneFlag==1)
                    {
                        document.getElementById("errMain").innerHTML="Please check the phone no. you have entered...";
                    }
                else if(EmailFlag==1)
                    {
                        document.getElementById("errMain").innerHTML="Please check the Email ID you have entered...";
                    }
           
        else
            {
                 document.getElementById('registerForm').submit();
            }
    }
     

function GetXmlHttpObject(){
var xmlHttp=null;
try{
  xmlHttp=new XMLHttpRequest();
 }
catch (e) {
 try {
  xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
  }
 catch (e){
  xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
 }
return xmlHttp;
}

