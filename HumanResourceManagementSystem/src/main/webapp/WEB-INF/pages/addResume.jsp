<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 11:14
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
    <form action="addResume" method="post">
        账号：<input id="name" type="text" name="name"/><br/>
        账号：<input id="sex" type="text" name="name"/><br/>
        账号：<input id="birth" type="text" name="name"/><br/>
        账号：<input id="school" type="text" name="name"/><br/>
        账号：<input id="nation" type="text" name="name"/><br/>
        账号：<input id="graduationTime" type="text" name="name"/><br/>
        账号：<input id="workEXP" type="text" name="name"/><br/>
        账号：<input id="birthPlace" type="text" name="name"/><br/>
        账号：<input id="evaluate" type="text" name="name"/><br/>
        账号：<input id="idCard" type="text" name="name"/><br/>
        账号：<input id="phone" type="text" name="name"/><br/>
        账号：<input id="email" type="text" name="name"/><br/>
        <input type="submit" value="完成">
    </form>
</body>
</html>