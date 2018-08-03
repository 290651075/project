<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/2
  Time: 16:06
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
<form action="addTR1" method="post">
    主题：    <input id="theme" type="text" name="theme"/><br/>
    开始时间：<input id="start" type="date" name="start"/><br/>
    结束时间：<input id="end" type="date" name="end"/><br/>
    培训内容：<input id="trainingCon" type="text" name="trainingCon"/><br/>
    培训地点：<input id="place" type="text" name="place"/><br/>
    <input type="submit" value="完成">
</form>
</body>
</html>