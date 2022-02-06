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
        <th>Date of create</th>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.author.name}</td>
            <td>${article.created}</td>
        </tr>
    </c:forEach>
    <br>

</table>

