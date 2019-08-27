<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
<title>Results test</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>
    <table class="table table-hover table-sm">
        <caption>List of class</caption>
        <thead>
        <tr>
            <th>ID</th>
            <th>name</th>
            <th>description</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items = "${classList}" var = "classController">
            <tr>
             <td>${classController.id}</td>
             <td>${classController.name}</td>
             <td>${classController.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a class="btn btn-primary" href="/class/test-form">New ListOfClasses</a>
</body>