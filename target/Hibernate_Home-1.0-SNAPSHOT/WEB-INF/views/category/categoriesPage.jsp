<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 01.02.2022
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table>
    <tr>
        <th>Name</th>
        <th>Description</th>
    </tr>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.name}</td>
            <td>${category.description}</td>
            <td>
                <a href="<c:url value="/categories/edit/${category.id}"/>">Edit</a>
            </td>
            <td>
                <a href="<c:url value="/categories/delete/${category.id}"/>">Delete</a>
            </td>
        </tr>
    </c:forEach>
    <br>

    <a href="<c:url value="/categories/form"/>">Add new Category</a><br>
    <a href="<c:url value="/authors/form"/>">Add new Author</a> <br>
    <a href="<c:url value="/articles/form"/>">Add new Article</a>
</table>


<a href="<c:url value="/categories"/>">Categories</a><br>
<a href="<c:url value="/authors"/>">Authors</a><br>
<a href="<c:url value="/articles"/>">Articles</a>