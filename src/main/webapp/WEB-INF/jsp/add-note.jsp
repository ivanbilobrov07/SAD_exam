<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add New Note</title>
    </head>
    <body>
        <a href="<c:url value="/notes"/>">Back</a>

        <c:url var="add_note" value="/notes"/>
        <form:form action="${add_note}" method="post" modelAttribute="note">
            <form:label path="title">Title: </form:label> <form:input type="text" path="title"/>
            <br>
            <form:label path="content">Content: </form:label> <form:input type="text" path="content"/>
            <br>
            <button>Add note</button>
        </form:form>
    </body>
</html>