<%@ page import="com.lx.model.Recruitment" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 17:47
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
<form action="addRec">
    <input type="submit" value="添加招聘信息">
</form>
<%
    List<Recruitment> recruitments= (List<Recruitment>) session.getAttribute("recruitments5");
    int totalPages= (int) session.getAttribute("totalPages5");

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
        <td><%=recruitments.get(i).getPosition().getName()%></td>
        <td><%=recruitments.get(i).getDepartment().getName()%></td>
        <td><%=recruitments.get(i).getIntroduction()%></td>
        <td><%=recruitments.get(i).getpNum()%></td>
        <td><%=recruitments.get(i).getSalary()%></td>
        <td><%=recruitments.get(i).getDate()%></td>
        <td>
            <form action="updateRec1">
                <input name="id" type="hidden" value="<%=recruitments.get(i).getId()%>">
                <input type="submit" value="修改"/>
            </form>
        </td>
        <td>
            <form action="deleteRec">
                <input name="id" type="hidden" value="<%=recruitments.get(i).getId()%>">
                <input type="submit" value="删除"/>
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
<a href="getAllRec?currentPage1=<%=i%>">&nbsp;<%=i%>&nbsp;</a>

<%
    }
%>

</body>
</html>