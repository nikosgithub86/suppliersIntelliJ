<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Insert</title>
</head>
<body>
<form:form modelAttribute="suplier" method="post">
    <p>
        <form:label path="companyName">companyName</form:label>
        <form:input path="companyName"/>
    </p>
    <p>
        <form:label path="name">name</form:label>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="surname">surname</form:label>
        <form:input path="surname"/>
    </p>
    <p>
        <form:label path="vaTnumber">vaTnumber</form:label>
        <form:input path="vaTnumber"/>
    </p>
    <p>
        <form:label path="iRoffice">iRoffice</form:label>
        <form:input path="iRoffice"/>
    </p>
    <p>
        <form:label path="zipCode">zipCode</form:label>
        <form:input path="zipCode"/>
    </p>
    <p>
        <form:label path="city">city</form:label>
        <form:input path="city"/>
    </p>
    <p>
        <form:label path="country">country</form:label>
        <form:input path="country"/>
    </p>
    <input type="submit">
</form:form>
</body>
</html>