<%@ page import="com.lx.model.Training" %>
<%@ page import="com.lx.util.DateAndString" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/3
  Time: 2:22
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

<form action="updateTR1" method="post">
    培训主题:<input id="theme" type="text" name="theme" value="${sessionScope.training.theme}"/><br/>
    培训开始时间:<input id="start" type="date" name="start" value=""/><br/>
    培训结束时间:<input id="end" type="date" name="end" value="${DateAndString.dateToString(sessionScope.training.getEnd())}"/><br/>
    培训地:<input id="place" type="text" name="place" value="${sessionScope.training.place}"/><br/>
    主要培训内容:<input id="trainingCon" type="text" name="trainingCon" value="${sessionScope.training.trainingCon}"/><br/>
    <input type="submit" value="确认修改">
</form>
</body>
</html>