<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <!--Custom styles-->
    <link rel="stylesheet" type="text/css" href="css/login.css">

    <title>Login Account</title>
</head>

<body>
    <div id="logreg-forms">
        <!------------------------------- signin account ----------------------------- -->
        <form action="AdminPanel" class="form-signin" method="post">
            <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Admin User</h1>
            <p> </p>
            <input type="text" name="username" class="form-control" placeholder="Enter username" required
                autofocus>
                <p> </p>
            <input type="password" name="password" class="form-control" placeholder="Password" required>
                
                <p> </p>
            <button  class="btn btn-primary btn-block" type="submit" id="btn-signup"><i class="fas fa-user-plus"></i>
                LogIn to Account</button>
            <a href="index.jsp" id=""><i class="fas fa-angle-left"></i> Back</a>
        </form>
    </div>
  
</body>
</html>