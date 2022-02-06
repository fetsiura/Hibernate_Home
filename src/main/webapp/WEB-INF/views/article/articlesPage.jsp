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
        <th>Title</th>
        <th>Content</th>
        <th>Author</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.author.surname}</td>
            <td>
                <a href="<c:url value="/articles/edit/${article.id}"/>">Edit</a>
            </td>
            <td>
                <a href="<c:url value="/articles/delete/${article.id}"/>">Delete</a>

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