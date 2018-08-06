<%@ page import="com.lx.model.Interview" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/4
  Time: 16:42
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
    List<Interview> interviews= (List<Interview>) session.getAttribute("interviewsR");
%>
<h1>面试成功信息</h1>
<table >
    <tr>
        <th>部门</th>
        <th>职位</th>
    </tr>
        <%
        for (int i=0;i<interviews.size();i++){
    %>
    <tr>
        <td><%=interviews.get(i).getRecruitment().getDepartment().getName()%></td>
        <td><%=interviews.get(i).getRecruitment().getPosition().getName()%></td>
        <td>
            <form action="entry">
                <input name="id" type="hidden" value="<%=interviews.get(i).getId()%>">
                <input type="submit" value="入职">
            </form>
            <form action="refuse">
                <input name="id" type="hidden" value="<%=interviews.get(i).getId()%>">
                <input type="submit" value="拒绝">
            </form>
        </td>
    </tr>
        <%
        }
    %>
</body>
</html>