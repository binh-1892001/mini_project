<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 5/9/2024
  Time: 8:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select name="category" id="">
    <c:forEach items="${categories}" var="cate">
        <option value="${cate.id}">${cate.name}</option>
    </c:forEach>
</select>
</body>
</html>
