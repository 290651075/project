<%@ page import="com.lx.model.Interview" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/4
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
    List<Interview> interviews= (List<Interview>) session.getAttribute("interviewsAD");
%>
<h1>面试者列表</h1>
<table >
    <tr>
        <th>面试人</th>
    </tr>
        <%
        for (int i=0;i<interviews.size();i++){
    %>
    <tr>
        <td><%=interviews.get(i).getResume().getName()%></td>
        <td>
            <form action="hire">
                <input name="id" type="hidden" value="<%=interviews.get(i).getId()%>">
                <input type="submit" value="通过面试可以录用"/>
            </form>
        </td>
        <td>
            <form action="noHire">
                <input name="id" type="hidden" value="<%=interviews.get(i).getId()%>">
                <input type="submit" value="未通过面试"/>
            </form>
        </td>
    </tr>
        <%
        }
    %>
</body>
</html>