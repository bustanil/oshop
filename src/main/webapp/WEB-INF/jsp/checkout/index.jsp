<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Checkout</title></head>
<body>
    <h3>Silahkan login.</h3>
    <form action="user/login.php" method="POST">
        Username <input id="username" name="usernameText" type="text" /><br>
        Password <input id="username" name="passwordText" type="password" /><br>
        <input id="submit" name="loginButton" type="submit" value="Login" /><br>
        Belum terdaftar? klik di <a href="user/register.php">sini</a>.
    </form>
</body>
</html>