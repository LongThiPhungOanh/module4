
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>USD to VND Conversion</title>
</head>
<body>
<h1>USD to VND Conversion</h1>
<form action="/test" method="post">
    <p>1 USD is equal to 24.000 VND</p>
    <label for="usdAmount">USD Amount:</label>
    <input type="number" id="usdAmount" name="usdAmount"
           value="${conversion.getUsdAmount()}"/>
    <input type="submit" value="Convert"/>
</form>
<p>${conversion.getResult()}</p>
</body>
</html>
