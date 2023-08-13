
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.asn.model.BookDetail"%>
<%@ page pageEncoding="UTF-8"%>

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
          <a class="navbar-brand" href="index.html">Home</i></a>
        </div>
      </nav>
    <div class="bookList">
        <table>
       
            <tr>
                <th>Book Id</th>
                <th class="bookName">Book Name</th>
                <th>Action</th>
            </tr>
             <%
        List<BookDetail> objectList = (List<BookDetail>) request.getAttribute("booklist");
        Iterator<BookDetail> iterator = objectList.iterator();
       
        
        while (iterator.hasNext()) {
        	BookDetail obj = iterator.next();
            Integer i = obj.getBook_id();
            
    %>
            <tr>
                <td><%= obj.getBook_id() %></td>
                <td class="bookName"><%= obj.getBookname() %></td>
                <td>
                <form action="delete" method ="post" >
                <input name="book_id" type ="hidden" value="<%= obj.getBook_id()%>" />
                    <input type="submit"  name ="data" value="Delete"></input>
                    </form>
                </td>
            </tr>
             <%
        }
    %>
        </table>
        
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>
