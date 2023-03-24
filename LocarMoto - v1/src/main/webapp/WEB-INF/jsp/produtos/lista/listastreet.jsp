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
    <h3>Lista de Motos Street</h3>
    <c:if test="${empty streets}">
        <h5>Não há motos cadastradas.</h5>
    </c:if>
    <c:if test="${not empty streets}">
    <h5>A quantidade de motos Street cadastradas é: ${streets.size()}!!!</h5>
</div>
<table class="container-table">
    <thead>
    <tr>
        <th>ID</th>
        <th>paraTrabalho</th>
        <th>cilindradas</th>
        <th>seguro</th>
        <th>tipo</th>
        <th>ano</th>
        <th>valorVenal</th>
        <th>precoDiaria</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="u" items="${streets}">
        <tr>
            <td>${u.id}</td>
            <td>${u.paraTrabalho}</td>
            <td>${u.cilindradas}</td>
            <td>${u.seguro}</td>
            <td>${u.tipo}</td>
            <td>${u.ano}</td>
            <td>${u.valorVenal}</td>
            <td>${u.precoDiaria}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>
</body>
</html>