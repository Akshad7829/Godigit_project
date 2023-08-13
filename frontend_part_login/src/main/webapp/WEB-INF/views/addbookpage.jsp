<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
          <a class="navbar-brand" href="index.html">Library</i></a>
        </div>
        <form action="user" method ="post" >
	                    <input type="submit" class="btn" style="background-color:#e79b54; font-weight:bold;" href="profile" value="Home"></input>
	                    </form>
      </nav>
     <h3 class="error" style="height: 50px; width:200px; margin:10px auto;">
        ${email}
    </h3>
    <div>
        <form class="form" action="addbook" method="post">
            <h1 style="text-align: center;">Add Books</h1>
            <div class="mb-3">
                <label for="exampleInputBookName" class="form-label">Book Name</label>
                <input type="text" class="form-control" name = "bookname" id="exampleInputBookName">
            </div>
            <div class="mb-3">
                <label for="exampleInputBookId" class="form-label">Book Id</label>
                <input type="number" class="form-control"  name= "book_id"id="exampleInputBookId">
            </div>
            <div class="mb-3">
                <label for="exampleInputBookCount" class="form-label">Book Count</label>
                <input type="number" class="form-control" name="bookcnt"id="exampleInputBookCount">
            </div>
            <div class="mb-3">
                <label for="exampleInputBookEdition" class="form-label">Book Edition</label>
                <input type="number" class="form-control" name="bookedition"id="exampleInputBookEdition">
            </div>
            <div class="mb-3">
                <label for="exampleInputBookAuthor" class="form-label">Book Author</label>
                <input type="text" class="form-control" name="bookauthor" id="exampleInputBookAuthor">
            </div>
            <div class="mb-3">
                <label for="exampleInputBookImage" class="form-label">Book Image</label>
                <input type="file" class="form-control" name="bookimage" id="exampleInputBookImage">
            </div>
            
            <div>
                <label for="exampleInputCategory" class="form-label">Category</label>
                <select class="form-select" name="bookcategory" aria-label="Default select example" id="exampleInputRole"
                    required>
                    <option selected>Select Category</option>
                    <option value="ficton">Ficton</option>
                    <option value="Sci-fi">Sci-fi</option>
                </select>
            </div>
            <div class="btns" style="margin-top: 20px;">
                <button type="submit" class="btn btn-primary">Add Book</button>
            </div>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>