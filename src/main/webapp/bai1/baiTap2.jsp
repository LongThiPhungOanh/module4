<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tra cứu từ Anh - Việt</title>
</head>
<body>
<h1>Tra cứu từ Anh - Việt</h1>
<form action="/lookup" method="post">
    <input type="text" name="key" placeholder="Nhập từ cần tra">
    <input type="submit" value="Tra cứu">
</form>
<p>${result}</p>
</body>
</html>
