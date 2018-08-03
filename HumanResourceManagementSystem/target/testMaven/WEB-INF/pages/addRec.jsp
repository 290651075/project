<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 20:35
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
<form action="addRec1" method="post">
    部门：     <input id="name" type="text" name="name"/><br/>
    职位：     <input id="sex" type="text" name="sex"/><br/>
    简介：     <input id="birth" type="date" name="birth"/><br/>
    基本薪资 ：<input id="school" type="text" name="school"/><br/>
    招聘人数： <input id="rname" type="text" name="rname"/><br/>
    <input type="submit" value="完成">
</form>
</body>
</html>