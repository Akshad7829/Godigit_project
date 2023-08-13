<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asn.model.UserAllDetails" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=\, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 <style><%@include file="../css/style.css"%></style>
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
    <div class="bookList">
        <table>
            <tr>
                <th>S.no</th>
                <th>First Name</th>
                <th>Email</th>
                <th>Role</th>
                <th>Address</th>
                <th>Phone No</th>
            </tr>
            <%

//  List<BookDetail> objectList = (List<BookDetail>) request.getAttribute("bookcategorylist");
 List<UserAllDetails> objectList = (List<UserAllDetails>) request.getAttribute("userdetail");

         Iterator<UserAllDetails> iterator = objectList.iterator();
       
        if(objectList != null){
         while (iterator.hasNext()) {
        	 UserAllDetails obj = iterator.next(); 
//               String base64Encoded = new String(Base64.encodeBase64(obj.getBookimage()), "UTF-8"); 
//  				FileOutputStream fimage = new FileOutputStream("abc.png"); 
// 						fimage.write(obj.getBookimage()); 
// 						fimage.close(); 
//               request.setAttribute("imageBt", base64Encoded); 
//             out.println(url);
            
%>  
            <tr>
                <td><%= obj.getUser_id() %></td>
                <td ><%= obj.getFname() %></td>
                <td><%= obj.getEmail()%></td>
                <td><%= obj.getRole() %></td>
                <td><%= obj.getAddres() %></td>
                <td><%= obj.getPhone_no() %></td>
            </tr>
                            <%

}
        }
        
 %>
        </table>
        
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>