
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>${menus.size()}</h1>
<table>
    <c:forEach items="${menus}" var="menu" varStatus="st">
        <tr>
            <td>${menu.id}</td>
            <td>${menu.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
