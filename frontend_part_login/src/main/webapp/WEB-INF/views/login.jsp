<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style><%@include file="../css/style.css"%></style>

</head>
<body>
<h1>${password}</h1>
<h1>${email}</h1>
<div class="overlay">
<!-- LOGN IN FORM by Omar Dsoky -->
<form action = "get" method ="post">
   <!--   con = Container  for items in the form-->
   <div class="con">
   <!--     Start  header Content  -->
   <header class="head-form">
      <h2>Log In</h2>
      <!--     A welcome message or an explanation of the login form -->
      <p>Log In here using your username and password</p>
   </header>
   <!--     End  header Content  -->
   <br>
   <div class="field-set">
     
      <!--   user name -->
         <span class="input-item">
           <i class="fa fa-user-circle"></i>
         </span>
        <!--   user name Input-->
         <input class="form-input" id="txt-input" name ="email" type="email" placeholder="@Email" required>
     
     
     
      <br>
           <!--   Password -->
     
      <span class="input-item">
        <i class="fa fa-key"></i>
       </span>
      <!--   Password Input-->
      <input class="form-input" type="password" name ="password" placeholder="Password" id="pwd"  name="password" required>
     
<!--      Show/hide password  -->
<!--      <span> -->
<!--         <i class="fa fa-eye" aria-hidden="true"  type="button" id="eye"></i> -->
<!--      </span> -->
     
     
      <br>
<!--        buttons -->
<!--      button LogIn -->
<!--       <button class="log-in"> Log In </button> -->
<!-- <input type="submit" value="sign"> -->
      <button class="btn submits sign-up" type="submit">Log In	
<!--         Sign Up font icon -->
      <i class="fa fa-user-plus" aria-hidden="true"></i>
      </button>
   </div>
  
<!--   other buttons -->
   <div class="other">
<!--      Forgot Password button-->
      <button class="btn submits frgt-pass">Forgot Password</button>
         <button class="btn submits frgt-pass"><a href = "/">Sign Up</a></button>
      
<!--     Sign Up button -->
     
<!--      End Other the Division -->
   </div>
     
<!--   End Conrainer  -->
  </div>
  
  <!-- End Form -->
</form>
</div>     
</body>
</html>