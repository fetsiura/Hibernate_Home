<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New Book Form</title>
    <style>
        .my-error {
            color: red;
        }
    </style>
</head>
<body>
<form:form  method="post" modelAttribute="author">
    Name:
    <form:input path="name" /> <br>
    <form:errors path="name" cssClass="my-error"/><br>

    Surname:
    <form:input path="surname" /><br>
    <form:errors path="surname" cssClass="my-error"/><br>


    <input type="submit" value="Save">
</form:form>
</body>
</html>
