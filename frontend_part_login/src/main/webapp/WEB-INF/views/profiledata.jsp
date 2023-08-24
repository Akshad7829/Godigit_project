<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asn.model.UserAllDetails"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=\, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 <style><%@include file="../css/style.css"%></style>
    <style>
        .profileBox{
            width:300px;
            height: 400px;
            margin: 30px auto;
            display: flex;
            align-items: center;
            justify-content:space-around;
            flex-direction: column;
            background-color: white;
            box-shadow: rgba(0, 0, 0, 0.25) 0px 54px 55px, rgba(0, 0, 0, 0.12) 0px -12px 30px, rgba(0, 0, 0, 0.12) 0px 4px 6px, rgba(0, 0, 0, 0.17) 0px 12px 13px, rgba(0, 0, 0, 0.09) 0px -3px 5px;
        }
        .profile{
            width: 150px;
            height: 150px;
            border-radius: 100%;
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-lg ">
        <div class="container-fluid">
            <a class="navbar-brand" href="./index.html">Library</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            
        </div>
    </nav>
    <div class="profileBox">
        <div>
            <img src="https://cdn-icons-png.flaticon.com/512/219/219983.png" class="profile" alt="">
        </div>
        <div>
            <p><b>UserId: </b>${userprofile.user_id}</p>
            <p><b>Name: </b><input  value="${userprofile.fname}"></p>
            <p><b>Email: </b>${userprofile.email}</p>
            <p><b>Address : </b><input  value="${userprofile.addres}"></p>
            <p><b>Phone No.: </b><input  value="${userprofile.phone_no}"></p>
            <p><b>Role: </b>${userprofile.role}</p>
			<form action  = "saveeprofile" method ="get">
			                <input name=email type="hidden" value="${userprofile.email}" />
                <a  href = "updateprofile"class="btn btn-primary link">Update</a>
                </form>
        </div>
<!--  		<div class="chotaBox" style="background-image:linear-gradient(rgba(255, 255, 0, 0.475),pink);"> -->
			
<!--             </div> -->

        </div>
        
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>
