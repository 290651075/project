<%@ page import="java.util.List" %>
<%@ page import="com.lx.model.Resume" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 5:39
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
    List<Resume> resumes= (List<Resume>) session.getAttribute("resumes");
    int totalPages= (int) session.getAttribute("totalPages1");

%>
<h1>招聘信息</h1>
<table >
    <tr>
        <th>职位</th>

    </tr>
    <%
        for (int i=0;i<resumes.size();i++){
    %>
    <tr>
        <td><%=resumes.get(i).getRname()%></td>

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