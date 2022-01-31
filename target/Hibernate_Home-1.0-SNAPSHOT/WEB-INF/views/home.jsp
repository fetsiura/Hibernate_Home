<%--
  Created by IntelliJ IDEA.
  User: jaro
  Date: 31.01.2022
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
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
            <td>${article.author.name}</td>
<%--            <td>--%>
<%--                <a href="<c:url value="/publishers/update/${publisher.id}"/>">Edit</a>--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <a href="<c:url value="/publishers/delete/${publisher.id}"/>">Delete</a>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
    <br>
<%--    <a href="<c:url value="/books/form"/>">Add new Book</a><br>--%>
<%--    <a href="<c:url value="/authors/form"/>">Add new Author</a> <br>--%>
<%--    <a href="<c:url value="/publishers/form"/>">Add new Publisher</a>--%>

</table>


<%--<a href="<c:url value="/publishers"/>">Publishers</a><br>--%>
<%--<a href="<c:url value="/authors"/>">Authors</a><br>--%>
<%--<a href="<c:url value="/books"/>">Books</a>--%>