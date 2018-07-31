<%@ page import="com.lx.model.Resume" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/30
  Time: 15:21
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
    List<Resume> resumes= (List<Resume>) session.getAttribute("resumes2");
    int totalPages= (int) session.getAttribute("totalPages2");

%>
<h1>欢迎查看简历</h1>
<table >
    <tr>
        <th>简历名称</th>

    </tr>
    <%
        for (int i=0;i<resumes.size();i++){
    %>
    <tr>
        <td><%=resumes.get(i).getRname()%></td>

        <td>
            <form action="submitRes1">
                <input name="id" type="hidden" value="<%=resumes.get(i).getId()%>">
                <input type="submit" value="确认投递">
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