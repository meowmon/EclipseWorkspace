	<%@ page language="java" contentType="text/html; charset=UTF-8"
	
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div class="login-clean" style="padding:60px;">
        <form action="Login" method="post" style="height:543px;">
            <h2 class="sr-only">Login Form</h2>
            <div class="illustration"><img src="assets/img/LogoTLU.png" style="width:244px;margin:0px;height:244px;"></div>
            <div class="form-group"><input class="form-control" id="username" type="username" name="username" placeholder="Username"></div>
            <div class="form-group"><input class="form-control" id="password" type="password" name="password" placeholder="Password"></div>
            <p style="color: red;">${errorString}</p>
            <div class="form-group"><button class="btn btn-primary btn-block" type="submit">Đăng nhập</button></div><a href="#" class="forgot">Quên mật khẩu ?</a></form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>