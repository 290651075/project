<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/5
  Time: 23:55
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
<form action="eM" method="post">
    账号：<input name="name"><br/>
    密码：<input name="pass"><br/>
    <input type="submit" value="登陆">
</form>
</body>
</html>