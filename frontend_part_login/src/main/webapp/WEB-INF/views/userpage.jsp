<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asn.model.BookDetail"%>


<%@page  import ="java.util.Base64" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    
    <style>
        .navbar{
            background-color: rgb(0, 187, 255);   
            font-weight:bold;
        }
        .search{
            width:50%;
            margin:50px auto;
        }
        form{
            width:100%;
            display: flex;
            align-items: center;
            justify-content: space-around;
            /* border: 2px solid black; */
        }
        .select{
            width:70%;
        }
        .cards{
            width:75%;
            height:auto; 
            margin: 0px auto;
            display: flex;
            align-items: center;
            justify-content: space-around;
            flex-wrap: wrap;
        }
        .card{
            
            width:200px;
            height: 300px;
            /* border: 2px solid black; */
            padding: 4px;
            margin-top: 15px;
            box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
            background-color:#c3cac966;
        }
        .butn{
            width:150px;
            margin: 0px 20px;
        }

    </style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg ">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html">Library</i></a>
        </div>
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html">Welcome-  ${uname} </i></a>
        </div>
        
       <div style="width:200px;display:flex; margin-right:140px">
       
        <div class="container-fluid">
        <form action="profile" method ="post" >
                <input name=email type="hidden" value="${uname} " />
                    <input type="submit" class="btn" style="background-color:#e79b54; font-weight:bold;" href="profile" value="Profile"></input>
                    </form>
            </div>
                   
            <div class="container-fluid">
        <form action="showissuebook" method ="post" >
                <input name=email  type="hidden" value="${uname}" />
                    <input type="submit" href="profile" style="background-color:#e79b54; font-weight:bold;" class="btn " value="Issued Books"></input>
                    </form>
            </div>
	             <div class="container-fluid">
	            
	            <form action="logout" method ="post" >
	                    <input type="submit" class="btn" style="background-color:#e79b54; font-weight:bold;" href="profile" value="Logout"></input>
	                    </form>
	            </div>
            </div>
            	
            
      </nav>
      <!-- ------------------------body--------------------------- -->
      
       
      <main>
    <h1>${data}</h1>
      
 
    
     
        <div class="box">
            <div class="search">
                <form action="searchbook" method="post">
                    <select class="form-select select" aria-label="Default select example" id="exampleInputRole" name ="bookcategory"
                    required>
                    <option selected>Select Category</option>
                    <option value="ficton">Ficton</option>
                    <option value="Sci-fi">Sci-fi</option>
                </select>
					<input name="email"   type="hidden" value="${uname}" /> 
                   <input type="submit"  value="Search"></input>
                </form>
                </div>
                
                <div class="cards">

 <%

//  List<BookDetail> objectList = (List<BookDetail>) request.getAttribute("bookcategorylist");
 List<BookDetail> objectList = (List<BookDetail>) request.getAttribute("bookcategorylist");

         Iterator<BookDetail> iterator = objectList.iterator();
       
        if(objectList != null){
         while (iterator.hasNext()) {
          	BookDetail obj = iterator.next(); 
              Integer i = obj.getBook_id(); 
//               String base64Encoded = new String(Base64.encodeBase64(obj.getBookimage()), "UTF-8"); 
//  				FileOutputStream fimage = new FileOutputStream("abc.png"); 
// 						fimage.write(obj.getBookimage()); 
// 						fimage.close(); 
//               request.setAttribute("imageBt", base64Encoded); 
//             out.println(url);
            
%>  

                <div class="card">
<!--                     <img src="abc.png"> -->
                    <p style="text-align: center;"><b>Book Id: </b><%= obj.getBook_id() %></p>

                    <p style="text-align: center;"><b>Book Name: </b><%= obj.getBookname() %></p>
                     <p style="text-align: center;"><b>Book Author: </b><%= obj.getBookauthor() %></p>
                     <p style="text-align: center;"><b>Book Category: </b><%= obj.getBookcategory() %></p>
                     <p style="text-align: center;"><b>Book Count: </b><%= obj.getBookcnt() %></p>
                    
<!--                     <button class="btn btn-primary butn">Issue Book</button> -->
                    <form action="issuebook" method ="post" >
					<input name="book_id"  type="hidden"value="<%= obj.getBook_id()%>" /> 
					<input name="bookname"  type="hidden"value="<%= obj.getBookname()%>" /> 
					<input name="bookauthor"  type="hidden"value="<%=obj.getBookauthor()%>" /> 
					<input name="bookcategory"  type="hidden"value="<%= obj.getBookcategory()%>" /> 
					<input name="bookcnt"  type="hidden" value="<%= obj.getBookcnt() %>" /> 
					<input name="bookedition" type="hidden" value="<%= obj.getBookedition() %>" /> 
					<input name="bookimage" type="hidden" value="<%= obj.getBookimage() %>" /> 
										
					
					<input name="email"  type="hidden"  value="${uname}" /> 
                   <button type="submit" class="btn btn-primary" style="background-color:yellow; color:black"  type="hidden">Issue Book</button>
                    </form>
                </div>
                <%

}
        }
        
 %>
                 </div>
 
            </div>

      </main>
     

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>


        

</body>
</html>

