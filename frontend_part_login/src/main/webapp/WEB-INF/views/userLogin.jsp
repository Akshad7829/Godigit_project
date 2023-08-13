<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 <style><%@include file="../css/style.css"%></style>
    </head>
    <body>
   
    
        <nav class="navbar navbar-expand-lg  ">
            <div class="container-fluid">
              <a class="navbar-brand" href="home">Library</a>
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
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      Login
                    </a>
                   
                  </li>
                 
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        
        
        <div>
      <form class="form" action ="login" method="post">
        <h1 style="text-align: center;"> Login</h1>
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">User Id</label>
            <input type="number" name ="user_id" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text"></div>
          </div>
          <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" name ="password"class="form-control" id="exampleInputPassword1">
          </div>
          <div class="btns">
            <button type="submit" class="btn btn-primary">Login</button>
            <p>New User ? <a href="signup">Register Here</a></p>
          </div>
        </form>
    </div><br>
    <p  style="height: 50px; width:300px; margin:30px auto 0 auto;">Made with ❤ By Team TechnoStrikers</p>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    
  </body>
  </html>