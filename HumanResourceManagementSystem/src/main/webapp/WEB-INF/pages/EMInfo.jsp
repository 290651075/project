<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/5
  Time: 18:16
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
账户名：${sessionScope.employee.name}
密码:${sessionScope.employee.pass}
<a href="returnE">返回</a>
</body>
</html>