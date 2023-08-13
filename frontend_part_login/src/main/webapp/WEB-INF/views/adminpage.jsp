<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>

    <style>
    
    	
        .navbar{
            background-color: rgb(0, 187, 255);   
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
            width:80%;
            height:auto;
            /* border: 2px solid black; */
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
        }
        .butn{
            width:150px;
            margin: 0px 20px;
        }
        .box{
            margin-top: 7em;
        }

    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    



    <nav class="navbar navbar-expand-lg ">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html">Home</i></a>
        </div>
      </nav>
      <!-- ------------------------body--------------------------- -->
      <main>
        <div class="box">
            
            <div class="cards">
                <div class="card">
                    <!-- Book ki photo lagani hai -->
                    <img src="https://static.thenounproject.com/png/1827853-200.png" alt="book-ki-photo">
                    <p style="text-align: center;">Registered Users</p>
                    <a href="allusers" class="btn btn-primary butn">Check</a>
                </div>
                <div class="card">
                    <!-- Book ki photo lagani hai -->

<img src="https://img.freepik.com/free-vector/books-stack-realistic_1284-4735.jpg?size=626&ext=jpg" alt="book-ki-photo">                    
                    <p style="text-align: center;">Check issued book list</p>
                    <a href="allbooks" class="btn btn-primary butn">Check</a>
                </div>
<!--                 <div class="card"> -->
<!--                     Book ki photo lagani hai -->

<!-- 				<img class ="ii" src="../images/fine.png" alt="book-ki-photo">   -->
<!--                   <p style="text-align: center;">Check pending fines</p> -->
<!--                     <button class="btn btn-primary butn">Check</button> -->
<!--                 </div> -->
            </div>
        </div>
      </main>

</body>
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</html>