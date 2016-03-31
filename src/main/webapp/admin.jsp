<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Каталог</title>
</head>
<body>
<table>
    <c:forEach items="${itemList}" var="item">
        <jsp:useBean id="item" type="ru.countrystuff.model.Item"/>
        <tr>
            <td>${item.name}</td>
            <td>${item.vendor.name}</td>
            <td>${item.description}</td>
            <td>${item.itemCategory.name}</td>
            <td>${item.price}</td>
            <td><img src="catalogue/${item.image}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>