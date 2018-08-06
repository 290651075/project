<%@ page import="com.lx.model.Tourist" %>
<%@ page import="com.lx.model.Recruitment" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24
  Time: 11:11
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
<div id="div1">
    <div id="div2">
        <h1>Nice DD</h1>
        <h3>你好，尊敬的<%
            Tourist tourist= (Tourist) session.getAttribute("tourist");
            out.print(tourist.getName());
        %></h3>
    </div>

    <div id="div3">
        <ul>
            <li><a href="lookResume">查看简历</a></li>
            <li><a href="addResume1">添加简历</a></li>
            <li><a href="lookMail">查看信箱</a></li>
            <li><a href="lookInR">查看面试结果</a></li>
        </ul>
    </div>
</div>
<%
    List<Recruitment> recruitments= (List<Recruitment>) session.getAttribute("recruitments");
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
        <td><%=recruitments.get(i).getPosition().getName()%></td>
        <td><%=recruitments.get(i).getDepartment().getName()%></td>
        <td><%=recruitments.get(i).getIntroduction()%></td>
        <td><%=recruitments.get(i).getpNum()%></td>
        <td><%=recruitments.get(i).getSalary()%></td>
        <td><%=recruitments.get(i).getDate()%></td>
        <td>
            <form action="submitRes">
                <input name="id" type="hidden" value="<%=recruitments.get(i).getId()%>">
                <input type="submit" value="提交简历"/>
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

