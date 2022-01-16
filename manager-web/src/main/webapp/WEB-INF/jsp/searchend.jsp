<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24 0024
  Time: 上午 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>查询所有用户</title>
</head>
<body>
<%--查询结束<</br>--%>
<%--<h1>${message}</h1>--%>
<table align="center" border="1" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>名字</th>
        <th>年龄</th>
    </tr>
    <c:forEach items="${users}" var="u" varStatus="st">
        <tr>
            <th>${u.userid}</th>
            <th>${u.username}</th>
            <th>${u.userage}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
