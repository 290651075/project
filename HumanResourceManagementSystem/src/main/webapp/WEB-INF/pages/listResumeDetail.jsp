<%@ page import="com.lx.model.Resume" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 9:53
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
    Resume resume= (Resume) session.getAttribute("resume");
%>
<table >
    <tr>
        <th>职位</th>
        <th>部门</th>
        <th>职位介绍</th>
        <th>招聘人数</th>
        <th>工资待遇</th>
        <th>发布时间</th>
    </tr>
    <tr>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getRname()%></td>

        <td>
            <form action="listResume.jsp">
                <input type="submit" value="返回">
            </form>
        </td>
    </tr>
</table>
</body>
</html>