<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
EDIT:

<form:form method="post" action="/categories/update" modelAttribute="category"  >
    <form:hidden path="id"/>
    Name: <form:input path="name" />
    Description: <form:input path="description" />


    <input type="submit" value="Save">
</form:form>