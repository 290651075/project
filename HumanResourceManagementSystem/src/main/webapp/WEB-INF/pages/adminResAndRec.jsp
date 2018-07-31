<%@ page import="com.lx.model.ResAndRec" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 22:54
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
    List<ResAndRec> resAndRecs= (List<ResAndRec>) session.getAttribute("resAndRecs");

%>
<h1>应聘者简历</h1>
<table >
    <tr>
        <th>应聘职位</th>
        <th>应聘部门</th>
        <th>应聘者姓名</th>
    </tr>
    <%
        for (int i=0;i<resAndRecs.size();i++){
    %>
    <tr>
        <td><%=resAndRecs.get(i).getRecruitment().getPosition().getName()%></td>
        <td><%=resAndRecs.get(i).getRecruitment().getDepartment().getName()%></td>
        <td><%=resAndRecs.get(i).getResume().getName()%></td>
        <td>
            <form action="listResumeDetail1">
                <input name="id" type="hidden" value="<%=resAndRecs.get(i).getResume().getId()%>">
                <input type="submit" value="查看具体简历"/>
            </form>
        </td>
        <td>
            <form action="sendIn">
                <input name="id" type="hidden" value="<%=resAndRecs.get(i).getId()%>">
                <input type="submit" value="发送面试邀请"/>
            </form>
        </td>
        <td>
            <form action="sendIn1">
                <input name="id" type="hidden" value="<%=resAndRecs.get(i).getId()%>">
                <input type="submit" value="不符合条件"/>
            </form>
        </td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>