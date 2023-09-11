<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculate" method="post">
    <input type="number" name="num1" value="${num1}" required>
    <select name="operation" required>
        <option value="add">+</option>
        <option value="subtract">-</option>
        <option value="multiply">*</option>
        <option value="divide">/</option>
    </select>
    <input type="number" name="num2" value="${num2}" required>
    <input type="submit" value="Calculate">
</form>
<p>${result}</p>
</body>
</html>
