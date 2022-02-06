<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
EDIT:

<form:form method="post" action="/authors/update" modelAttribute="author" >
    <form:hidden path="id"/>
    Name:
    <form:input path="name" /> <br>
    <form:errors path="name" cssClass="my-error"/><br>

    Surname:
    <form:input path="surname" /><br>
    <form:errors path="surname" cssClass="my-error"/><br>


    <input type="submit" value="Save">
</form:form>