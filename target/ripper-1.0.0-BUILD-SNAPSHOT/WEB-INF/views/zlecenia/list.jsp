<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <link href="<c:url value="/resources/css/zlecenia.css" />" rel="stylesheet" type="text/css" media="screen" />
    <title>Listing Tramps</title>
</head>
<body>
<div class="container">
<h1>Zlecenia</h1>
<c:if test="${not empty zlecenia}">
  
    <table class="normal-table">
        <thead>
            <tr>
                <th>Key</th>
                <th>Name</th>
                <th>Sprzet</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="zlecenie" items="${zlecenia}">
            <tr>
                <td>${zlecenie.id}</td>
                <td>${zlecenie.opis}</td>
                <td>${zlecenie.typSprzetu.opis}</td>
                <td>${zlecenie.statusZlecenia.opis}</td>
            </tr>
            <c:forEach var="pozycjaZlecenia" items="${zlecenie.pozycjeZlecenia}">
            <tr>
             <td>${pozycjaZlecenia.opis}</td>
                <td>${pozycjaZlecenia.koszt}</td>
            </tr>
        </c:forEach>
        </c:forEach>
        </tbody>
    </table>
</c:if>
  
</div>
</body>
</html>