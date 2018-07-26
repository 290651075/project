<%@ page import="java.util.List" %>
<%@ page import="com.lx.model.Recruitment" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24
  Time: 11:37
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
<form action="login" method="post">
    账号：<input name="name"><br/>
    密码：<input name="pass"><br/>
    <input type="submit" value="登陆">
</form>
<form action="register1" method="post">
    <input type="submit" value="注册">
</form>
<%
    List<Recruitment> recruitments= (List<Recruitment>) session.getAttribute("recruitment");
    int totalPages= (int) session.getAttribute("totalPages");

%>
<h1>招聘信息</h1>
<table >
    <tr>
        <th>职位</th>
        <th>部门</th>
        <th>职位介绍</th>
        <th>招聘人数</th>
        <th>工资待遇</th>
        <th>发布时间</th>
    </tr>
    <%
        for (int i=0;i<recruitments.size();i++){
    %>
    <tr>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td><%=recruitments.get(i).getPosition()%></td>
        <td>
            <form action="#">
                <input type="submit" value="提交简历">
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
    for(int i=1;i<=totalPages;i++){
%>
<a href="?currentPage=<%=i%>">&nbsp;<%=i%>&nbsp;</a>

<%
    }
%>



</body>
</html>

