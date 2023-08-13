<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 <style><%@include file="../css/style.css"%></style>
  </head>
  <body>
   <!-- ---------------------navbar start-------------------------- -->
   <nav class="navbar navbar-expand-lg ">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"><h3>Library</h3></a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link" href="userlogin"  aria-expanded="false">
              Login
            </a>
<!--             <ul class="dropdown-menu"> -->
<!--               <li id="user"><a class="dropdown-item" >User Login</a></li> -->
<!--               <li><hr class="dropdown-divider"></li> -->
<!--               <li id="admin"><a class="dropdown-item" href="adminLogin.html">Admin Login</a></li> -->
<!--               <li id="library"><hr class="dropdown-divider"></li> -->
<!--               <li><a class="dropdown-item" href="libraryLogin.html">Library Login</a></li> -->
<!--             </ul> -->
          </li>
         
          </li>
        </ul>
      </div>
    </div>
  </nav>
   <!-- --------------------- navbar end--------------------------- -->
    

   <!-- --------------------bgBody start-------------------------- -->

   <div class="home">
    <div class="box">
        <h1 style="text-align:center">Welcome to Library Management System</h1> 
    <div class="members">
        <h2 style="text-align: center;">Our Team </h2>
        <ul class="list">
            <li><b>Member 1 :&nbsp;&nbsp;</b>Aditi Garg</li>
            <li><b>Member 2 :&nbsp;&nbsp;</b>Akshad Nayakwadi</li>
            <li><b>Member 3 :&nbsp;&nbsp;</b>Rohit sen</li>
            <li><b>Member 4 :&nbsp;&nbsp;</b>Vishal Upadhyay</li>
            <li><b>Member 5 :&nbsp;&nbsp;</b>Shivam Pandey</li>
        </ul>
    </div>
</div>

   </div>
       <p  style="height: 50px; width:300px; margin:10px auto;">Made with ❤ By Team TechnoStrikers</p>
   
   <!-- --------------------bgBody end-------------------------- -->
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>