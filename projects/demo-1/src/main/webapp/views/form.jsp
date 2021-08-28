<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<div class="container">
    <form:form action="/processForm" method="POST" modelAttribute="user">
        <form:input path="firstname"/>
        <form:errors path="firstname"/>

        <form:input path="lastname" />
        <form:errors path="lastname"/>

        <form:input type="number" path="age"/>
        <form:errors path="age" />

        <form:input path="password"/>
        <form:errors path="password" />

        <input type="submit" value="Submit">
    </form:form>
</div>

</body>
</html>