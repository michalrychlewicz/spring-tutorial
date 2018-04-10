<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>

<head>
    <title>Register student</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>

    Country:
    <form:select path="country">
        <form:options items="${countryOptions}"/>
    </form:select>
    <input type="submit" value="Submit">

    <br><br>
    Favorite language:
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    Pascal <form:radiobutton path="favoriteLanguage" value="Pascal"/>
    Asembler <form:radiobutton path="favoriteLanguage" value="Asembler"/>

</form:form>

</body>


</html>