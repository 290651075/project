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
        姓名：    <input id="name" type="text" name="name"/><br/>
        性别：    <input id="sex" type="text" name="sex"/><br/>
        出生日期：<input id="birth" type="text" name="birth"/><br/>
        毕业院校：<input id="school" type="text" name="school"/><br/>
        民族：    <input id="nation" type="text" name="nation"/><br/>
        毕业时间：<input id="graduationTime" type="text" name="graduationTime"/><br/>
        工作经验：<input id="workEXP" type="text" name="workEXP"/><br/>
        户籍所在：<input id="birthPlace" type="text" name="birthPlace"/><br/>
        自我评价：<input id="evaluate" type="text" name="evaluate"/><br/>
        身份证号：<input id="idCard" type="text" name="idCard"/><br/>
        电话号码：<input id="phone" type="text" name="phone"/><br/>
        电子邮箱：<input id="email" type="text" name="email"/><br/>
        <input type="submit" value="完成">
    </form>
</body>
</html>