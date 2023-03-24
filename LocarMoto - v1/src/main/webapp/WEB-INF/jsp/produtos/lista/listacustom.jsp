<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="styles.css">
    <title>Index</title>
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container-user">
    <h3>Lista de Motos Custom</h3>
    <c:if test="${empty customs}">
        <h5>Não há motos cadastradas.</h5>
    </c:if>
    <c:if test="${not empty customs}">
    <h5>A quantidade de motos Custom cadastradas é: ${customs.size()}!!!</h5>
</div>
<table class="container-table">
    <thead>
    <tr>
        <th>ID</th>
        <th>marca</th>
        <th>modelo</th>
        <th>cilindradas</th>
        <th>seguro</th>
        <th>ano</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="u" items="${customs}">
        <tr>
            <td>${u.id}</td>
            <td>${u.marca}</td>
            <td>${u.modelo}</td>
            <td>${u.cilindradas}</td>
            <td>${u.seguro}</td>
            <td>${u.ano}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</c:if>
</div>
</body>
</html>
