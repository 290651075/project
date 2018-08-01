<%@ page import="com.lx.model.Recruitment" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 19:23
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
<%
   Recruitment recruitment= (Recruitment) session.getAttribute("recruitment1");
%>
<form action="updateRec" method="post">
    职位简介：    <input id="introduction" type="text" name="introduction" value="<%=recruitment.getIntroduction()%>"/><br/>
    基本工资：    <input id="salary" type="text" name="salary" value="<%=recruitment.getSalary()%>"/><br/>
    招聘人数：    <input id="pNum" type="text" name="pNum" value="<%=recruitment.getpNum()%>"/><br/>
    <input type="submit" value="确认修改">
</form>
</body>
</html>