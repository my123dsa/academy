<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
</head>
<body>
<table>
    <tr>
        <th>번호</th>
        <th>이름</th>
        <th>진짜 나이</th>
        <th>국적</th>
        <th>현재나이</th>
    </tr>
    <c:choose>
        <c:when test="${empty requestScope.timeTravelerList || fn:length(timeTravelerList)==0}">
            <tr>
                <td> 등록된 Mouse 정보가 없습니다.</td>
            </tr>
        </c:when>
        <c:otherwise>
            <c:forEach items="${requestScope.timeTravelerList}" var="timeTraveler">
                <tr>
                    <td>${timeTraveler.id}</td>
                    <td>${timeTraveler.name}</td>
                    <td>${timeTraveler.realAge}</td>
                    <td>${timeTraveler.place}</td>
                    <td>${timeTraveler.newAge}</td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>

</table>

</body>
</html>