<%@ page import="java.util.List" %>
<%@ page import="com.lx.model.Interview" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/3
  Time: 0:10
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
    List<Interview> interviews= (List<Interview>) session.getAttribute("interviews");
%>
<h1>欢迎查看信箱</h1>
<table >
    <tr>
        <th>面试邀请部门</th>
        <th>面试邀请职位</th>
    </tr>
    <%
        for (int i=0;i<interviews.size();i++){
    %>
    <tr>
        <td><%=interviews.get(i).getRecruitment().getDepartment().getName()%></td>
        <td><%=interviews.get(i).getRecruitment().getPosition().getName()%></td>
        <td>
            <form action="accept">
                <input name="id" type="hidden" value="<%=interviews.get(i).getId()%>">
                <input type="submit" value="接受">
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
</table>
</body>
</html>