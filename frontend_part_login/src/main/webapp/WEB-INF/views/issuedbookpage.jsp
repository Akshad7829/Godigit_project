<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asn.model.issuedbookDto1"%>

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
        .img{
        width:100%;
        display:flex;
        align-items:center;
        justify-content:center;
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
      <%
        List<issuedbookDto1> objectList = (List<issuedbookDto1>) request.getAttribute("isbooklist");
        Iterator<issuedbookDto1> iterator = objectList.iterator();
       
        
        while (iterator.hasNext()) {
        	issuedbookDto1 obj = iterator.next();
            Integer i = obj.getBook_id();
            
    %>
    <div class="profileBox">
  
        <div class="img">
        
        <img style="width:100px; height:100px; margin:0px auto;" src=" data:image/png;base64,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" alt="">
        </div>
           <p><b>Book Id: </b><%= obj.getBook_id() %></p>
            <p><b>Book Name: </b><%=obj.getBookname()%></p>
             <p><b>Book Author: </b><%=obj.getBookauthor()%></p>
            <p><b>Book Category: </b><%= obj.getBookcategory()%></p>
  				<form action="return" method ="post" >
					<input name="email"   type="hidden" value="${uname}" /> 
					<input name="book_id"   type="hidden" value="<%= obj.getBook_id()%>" /> 
                   <input type="submit" style="width: 100%;margin-left: 10px" class="btn btn-danger"value="Return Book"></input>
                    </form>
        </div>
 	 <div>
           

        </div>

        </div>
                  <%
        }
    %>
        
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>
