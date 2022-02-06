<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
EDIT:

<form:form method="post" action="/articles/update" modelAttribute="article"  >
    <form:hidden path="id"/>
    <form:hidden path="created"/>
    <form:hidden path="updated"/>
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