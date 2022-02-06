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
<form:form  method="post" modelAttribute="article">
    Title:
    <form:input path="title" /> <br>
    <form:errors path="title" cssClass="my-error"/><br>

    Content:
    <form:input path="content" /><br>
    <form:errors path="content" cssClass="my-error"/><br>

    Author:
    <form:select itemValue="id" itemLabel="surname"
                 path="author.id" items="${authors}"/><br>

    Categories:
    <form:select  path="categories" itemValue="id" itemLabel="name" items="${categories}" multiple="true">
    </form:select>
    <form:errors path="categories" cssClass="my-error"/><br>


    <input type="submit" value="Save">
</form:form>
</body>
</html>
