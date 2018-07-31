<%@ page import="com.lx.model.Position" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/1
  Time: 2:55
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
<form action="addPo">
    <input type="submit" value="添加职位">
</form>
<%
    List<Position> positions= (List<Position>) session.getAttribute("positions");

%>
<h1>职位列表</h1>
<table >
    <tr>
        <th>职位名称</th>
        <th>职位级别</th>
    </tr>
        <%
        for (int i=0;i<positions.size();i++){
    %>
    <tr>
        <td><%=positions.get(i).getName()%></td>
        <td><%=positions.get(i).getState()%></td>
        <td>
            <form action="getEm">
                <input name="id" type="hidden" value="<%=positions.get(i).getId()%>">
                <input type="submit" value="查询该职位下的员工"/>
            </form>
        </td>
        <td>
            <form action="#">
                <input name="id" type="hidden" value="<%=positions.get(i).getId()%>">
                <input type="submit" value="删除职位"/>
            </form>
        </td>
        <td>
            <form action="#">
                <input name="id" type="hidden" value="<%=positions.get(i).getId()%>">
                <input type="submit" value="修改职位名称"/>
            </form>
        </td>
    </tr>
        <%
        }
    %>
</body>
</html>