<%@ page import="com.lx.model.Resume" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/27
  Time: 9:53
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
    Resume resume= (Resume) session.getAttribute("resume");
%>
<table >
    <tr>
        <th>姓名</th>
        <th>性别</th>
        <th>民族</th>
        <th>出生年月</th>
        <th>户籍所在地</th>
        <th>身份证号码</th>
        <th>电话号码</th>
        <th>邮箱地址</th>
        <th>毕业院校</th>
        <th>毕业时间</th>
        <th>工作经验</th>
        <th>自我评价</th>
    </tr>
    <tr>
        <td><%=resume.getRname()%></td>
        <td><%=resume.getSex()%></td>
        <td><%=resume.getNation()%></td>
        <td><%=resume.getBirth()%></td>
        <td><%=resume.getBirthPlace()%></td>
        <td><%=resume.getIdCard()%></td>
        <td><%=resume.getPhone()%></td>
        <td><%=resume.getEmail()%></td>
        <td><%=resume.getSchool()%></td>
        <td><%=resume.getGraduationTime()%></td>
        <td><%=resume.getWorkEXP()%></td>
        <td><%=resume.getEvaluate()%></td>

        <td>
            <form action="return">
                <input type="submit" value="返回">
            </form>
        </td>
    </tr>
</table>
</body>
</html>