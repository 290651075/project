<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/1
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
<form action="addPo1" method="post">
    请输入职位名：<input id="name" type="text" name="name">
    请输入职位等级：<input id="state" type="text" name="state">
    <input type="submit" value="确认添加">
    ${requestScope.error}
</form>
<form action="getPo" method="post">
    <input id="id" type="hidden" name="id" value="${sessionScope.departmentP.id}">
    <input type="submit" value="返回">
</form>
</body>
</html>