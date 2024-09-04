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

<form action="register" method="post">
    <input type="number" id="id" name="id"/>
    <input type="text" id="name" name="name"/>
    <input type="number" id="realAge" name="realAge"/>
    <input type="number" id="newAge" name="newAge"/>
    <input type="text" id="place" name="place"/>
    <button type="submit">제출</button>
</form>
</body>
</html>