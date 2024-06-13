<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Notes</title>
</head>
<body>
<h1>Notes</h1>
<ul>
    <c:forEach items="${notes}" var="note">
        <li>
            <p>${note.title}</p>
            <p>${note.content}</p>
        </li>
    </c:forEach>
</ul>
<a href="<c:url value="/notes/add"/>">Add new note</a>
</body>
</html>