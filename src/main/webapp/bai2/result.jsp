<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ds đã chọn là :</h1>
<c:forEach items="${list}" var="l" >
     <p><c:out value="${l}"/></p>
</c:forEach>
</body>
</html>