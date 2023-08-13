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
        <nav class="navbar navbar-expand-lg ">
            <div class="container-fluid">
              <a class="navbar-brand" href="./index.html">Library</a>
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
                    <ul class="dropdown-menu">
                      <li id="user"><a class="dropdown-item" href="userLogin.html">User Login</a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li id="admin"><a class="dropdown-item" href="adminLogin.html">Admin Login</a></li>
                      <li id="library"><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="libraryLogin.html">Library Login</a></li>
                    </ul>
                  </li>
                 
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        <div>
      <form class="form" action="send" method="post">
        <div class="mb-3">
            <div>
                <label for="exampleInputname" class="form-label" >User Name</label>
                <input type="text" class="form-control" name = "fname"id="exampleInputname" required>
            </div>
            <div>
                <label for="exampleInputAddress" class="form-label" >Address</label>
                <input type="text" class="form-control"name="addres" id="exampleInputAddress" required>
            </div>
        </div>
        <div class="mb-3">
            <div>
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp" required>
            </div>
            <div>
                <label for="exampleInputPhone" class="form-label" >Phone No</label>
                <input type="number" class="form-control" id="exampleInputPhone"name="phone_no" required>
            </div>
            <div>
                <label for="exampleInputRole" class="form-label">Role</label>
                <select class="form-select" name="role" aria-label="Default select example" id="exampleInputRole"name="role" required>
                    <option selected>Select Role</option>
                    <option value="user">User</option>
                    <option value="librarian">Librarian</option>
                  </select>
            </div>

        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label" >Password</label>
            <input type="password" class="form-control" name="password"id="exampleInputPassword1" required>
        </div>
        <div class="btns">
            <button type="submit" class="btn btn-primary">Sign Up</button>
            <p>Already a user ? <a href="./userLogin.html">Login Here</a></p>
        </div>
        </form>
    </div>
    <p  style="height: 50px; width:300px; margin:10px auto;">Made with ❤ By Team TechnoStrikers</p>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    
  </body>
  </html>