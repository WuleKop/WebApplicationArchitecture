<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
</head>
<body>
<form action="../action/login" method="get">
    Starbuck's  + ${roast.toUpperCase()} + Roast Coffees:
    <table>
        <c:forEach var="ad" items = "${advice}" varStatus="loop">
            <c:choose>
                <c:when test="${loop.index%2==0 }">
                    <tr style="background-color:cyan">
                </c:when>
                <c:otherwise>
                    <tr style="background-color:yellow">
                </c:otherwise>
            </c:choose>
            <td>${ad}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Back">
</form>
</body>
</html>
