<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Suppliers</title>
</head>
<body>

<table>

    <thead>
    <tr>
        <th>id</th>
        <th>companyName</th>
        <th>name</th>
        <th>surname</th>
        <th>vaTnumber</th>
        <th>iRoffice</th>
        <th>zipCode</th>
        <th>city</th>
        <th>country</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${supplierList}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.companyName}</td>
            <td>${s.name}</td>
            <td>${s.surname}</td>
            <td>${s.vaTnumber}</td>
            <td>${s.iRoffice}</td>
            <td>${s.zipCode}</td>
            <td>${s.city}</td>
            <td>${s.country}</td>
        </tr>
    </c:forEach>
    </tbody>

</table>


</body>
</html>