<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<style>
        .navbar{
            background-color: rgb(0, 187, 255);
            
        }
        .box{
            width:80%;
            height:400px;
            margin: 30px auto;
            display: flex;
            align-items: center;
            justify-content: space-around;
            background-color: aliceblue;
            box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
        }
        .chotaBox{
            width: 300px;
            height: 150px;
            /* border: 2px solid black; */
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            box-shadow: rgba(0, 0, 0, 0.1) 0px 4px 12px;
        }
        .chotaBox button{
            width:150px;
            height: 40px;
            border-radius:10px ;
            border: none;
            margin-top:10px ;
        }
        .link{
            width:120px;
        }
    </style>
</head>
<body>
 <nav class="navbar navbar-expand-lg ">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html">Home</i></a>
        </div>
<!--         <div class="container-fluid"> -->
	            
	            <form action="logout" method ="post" >
	                    <input type="submit" class="btn" style="background-color:#e79b54; font-weight:bold;" href="profile" value="Logout"></input>
	                    </form>
<!-- 	            </div> -->
      </nav>
       <h3>${email }</h3>
      <main>
        <div class="box">
            <div class="chotaBox" style="background-image:linear-gradient(rgba(255, 255, 0, 0.475),pink);">
                <h3>Add Books</h3>
                <a href="addbooks" class="btn btn-primary link">Add</a>
            </div>
            <div class="chotaBox" style="background-image:linear-gradient(rgba(255, 255, 0, 0.475),pink);">
                <h3>Remove Books</h3>
                <a href="booklist" class="btn btn-primary link">Remove</a>
            </div>
        </div>
      </main>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</body>
</html>