<%@ page import="com.lx.model.Department" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/2
  Time: 16:18
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
    List<Department> departments= (List<Department>) session.getAttribute("departmentsTR");

%>
<h1>部门列表</h1>
<table >
    <tr>
        <th>部门名称</th>
    </tr>
    <%
        for (int i=0;i<departments.size();i++){
    %>
    <tr>
        <td><%=departments.get(i).getName()%></td>
        <td>
            <form action="chooseIS">
                <input name="id" type="hidden" value="<%=departments.get(i).getId()%>">
                <input type="submit" value="确认"/>
            </form>
        </td>
    </tr>
    <%
        }
    %>
    ${requestScope.error}
</table>
</body>
</html>