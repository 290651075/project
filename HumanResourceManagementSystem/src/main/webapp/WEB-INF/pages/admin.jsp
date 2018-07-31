<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 17:24
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
<form action="getAllRec">
    <input type="submit" value="查看所有招聘信息">
</form>
<form action="getAllRes">
    <input type="submit" value="查看简历">
</form>
<form action="getDp">
    <input type="submit" value="管理部门">
</form>
</body>
</html>