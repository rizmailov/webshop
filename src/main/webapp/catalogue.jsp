<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate>
    <jsp:body>
        <table>
            <c:forEach items="${itemList}" var="item">
                <jsp:useBean id="item" type="ru.countrystuff.model.Item"/>
                <tr>
                    <td>${item.name}</td>
                    <td>${item.vendor.name}</td>
                    <td>${item.description}</td>
                    <td>${item.itemCategory.name}</td>
                    <td>${item.price}</td>
                    <td><img src="img/catalogue/${item.image}"/></td>
                </tr>
            </c:forEach>
        </table>
    </jsp:body>
</t:pageTemplate>