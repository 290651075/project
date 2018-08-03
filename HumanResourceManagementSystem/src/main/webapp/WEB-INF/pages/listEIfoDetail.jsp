<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/2
  Time: 10:22
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

<table >
    <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>出生年月</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
    </tr>
    <tr>
        <td>${sessionScope.PEm.name}</td>
        <td>${sessionScope.PEm.sex}</td>
        <td>${sessionScope.PEm.age}</td>
        <td>${sessionScope.PEm.phone}</td>
        <td>${sessionScope.PEm.email}</td>

        <td>
            <form action="#">
                <input type="submit" value="返回">
            </form>
        </td>
    </tr>
</table>
</body>
</html>