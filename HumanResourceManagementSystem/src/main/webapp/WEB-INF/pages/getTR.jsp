<%@ page import="com.lx.model.Training" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/2
  Time: 15:07
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
<form action="addTR">
    <input type="submit" value="添加培训">
</form>
<%
    List<Training> trainings= (List<Training>) session.getAttribute("trainings");
    int totalPages= (int) session.getAttribute("totalPagesTR");

%>
<h1>培训列表</h1>
<table >
    <tr>
        <th>培训主题</th>
        <th>培训开始时间</th>
        <th>培训结束时间</th>
        <th>培训地点</th>
        <th>主要培训内容</th>
    </tr>
    <%
        for (int i=0;i<trainings.size();i++){
    %>
    <tr>
        <td><%=trainings.get(i).getTheme()%></td>
        <td><%=trainings.get(i).getStart()%></td>
        <td><%=trainings.get(i).getEnd()%></td>
        <td><%=trainings.get(i).getPlace()%></td>
        <td><%=trainings.get(i).getTrainingCon()%></td>

        <td>
            <form action="updateTR">
                <input name="id" type="hidden" value="<%=trainings.get(i).getId()%>">
                <input type="submit" value="修改">
            </form>
            <form action="revoke">
                <input name="id" type="hidden" value="<%=trainings.get(i).getId()%>">
                <input type="submit" value="撤回">
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
<a href="getTR?currentPage=<%=i%>">&nbsp;<%=i%>&nbsp;</a>

<%
    }
%>
</body>
</html>