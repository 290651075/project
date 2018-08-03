<%@ page import="com.lx.model.Department" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/1
  Time: 2:36
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
<form action="addDp">
    <input type="submit" value="添加部门">
</form>
<%
    List<Department> departments= (List<Department>) session.getAttribute("departments");

%>
<h1>部门列表</h1>
<table >
    <tr>
        <th>部门名称</th>
        <th>创建时间</th>
    </tr>
    <%
        for (int i=0;i<departments.size();i++){
    %>
    <tr>
        <td><%=departments.get(i).getName()%></td>
        <td><%=departments.get(i).getCreation()%></td>
        <td>
            <form action="getPo">
                <input name="id" type="hidden" value="<%=departments.get(i).getId()%>">
                <input type="submit" value="查询职位"/>
            </form>
        </td>
        <td>
            <form action="deleteDp">
                <input name="id" type="hidden" value="<%=departments.get(i).getId()%>">
                <input type="submit" value="删除部门"/>
            </form>
        </td>
        <td>
            <form action="updateDp">
                <input name="id" type="hidden" value="<%=departments.get(i).getId()%>">
                <input type="submit" value="修改部门名称"/>
            </form>
        </td>
        <td>
            <form action="getDE">
                <input name="id" type="hidden" value="<%=departments.get(i).getId()%>">
                <input type="submit" value="查询该部门下所有员工"/>
            </form>
        </td>
    </tr>
    ${requestScope.error2}
    <%
        }
    %>
</table>
</body>
</html>