<%@ page import="java.util.List" %>
<%@ page import="com.lx.model.EInfo" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/2
  Time: 10:00
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
    List<EInfo> eInfos= (List<EInfo>) session.getAttribute("eInfosPE");
    int totalPages= (int) session.getAttribute("totalPagesPE");
%>
<table >
    <tr>
        <th>员工姓名</th>

    </tr>
    <%
        for (int i=0;i<eInfos.size();i++){
    %>
    <tr>
        <td><%=eInfos.get(i).getName()%></td>

        <td>
            <form action="listEIfoDetail">
                <input name="id" type="hidden" value="<%=eInfos.get(i).getId()%>">
                <input type="submit" value="查看">
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