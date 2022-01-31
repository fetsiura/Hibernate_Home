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
<form:form  method="post" modelAttribute="category">
    Title:
    <form:input path="name" /> <br>

    Description:
    <form:input path="description" /><br>

    <input type="submit" value="Save">
</form:form>
</body>
</html>
