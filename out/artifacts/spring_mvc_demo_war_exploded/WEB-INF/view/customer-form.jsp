<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>

<head>
    <title>Validate customer</title>
    <style>
        .error {color:red}
    </style>
</head>

<body>
<i>Fill out the form. Asterix (*) means mandatory field.</i>
<form:form action="processForm" modelAttribute="customer">
    First Name: <form:input path="firstName"></form:input>
    <br><br>
    Last Name (*): <form:input path="lastName"></form:input>
    <form:errors path="lastName" cssClass="error"></form:errors>
    <br><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>

</html>