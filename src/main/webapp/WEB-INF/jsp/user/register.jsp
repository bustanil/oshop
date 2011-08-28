<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>User Registration</title></head>
<body>
    <h3>User Registration</h3>

    <form:form method="POST" modelAttribute="userRegistration">
        <form:errors path="*" />
        <table>
            <tr><td>Full Name</td><td><form:input path="user.fullName"/></td></tr>
            <tr><td>Email</td><td><form:input path="user.email"/></td></tr>
            <tr><td>Retype Email</td><td><form:input path="emailConfirmation"/></td></tr>
            <tr><td>Password</td><td><form:password path="user.password"/></td></tr>
            <tr><td>Retype Password</td><td><form:password path="passwordConfirmation"/></td></tr>
            <tr align="center"><td colspan="2"><input name="registerButton" type="submit" value="Register" /></td></tr>
        </table>
    </form:form>

</body>
</html>