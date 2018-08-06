<%@ page import="com.lx.model.Resume" %>
<%@ page import="com.lx.util.DateAndString" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 13:57
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
    Resume resume= (Resume) session.getAttribute("resume1");
%>
<form action="/updateResumeDetail" method="post">
    姓名：    <input id="name" type="text" name="name" value="<%=resume.getName()%>"/><br/>
    性别：    <input id="sex" type="text" name="sex" value="<%=resume.getSex()%>"/><br/>
    出生日期：<input id="birth" type="date" name="birth" value="<%=DateAndString.dateToString(resume.getBirth())%>"/><br/>
    毕业院校：<input id="school" type="text" name="school" value="<%=resume.getSchool()%>"/><br/>
    简历名：  <input id="rname" type="text" name="rname" value="<%=resume.getRname()%>"/><br/>
    民族：    <input id="nation" type="text" name="nation" value="<%=resume.getNation()%>"/><br/>
    毕业时间：<input id="graduationTime" type="date" name="graduationTime" value="<%=DateAndString.dateToString(resume.getGraduationTime())%>"/><br/>
    工作经验：<input id="workEXP" type="text" name="workEXP" value="<%=resume.getWorkEXP()%>"/><br/>
    户籍所在：<input id="birthPlace" type="text" name="birthPlace" value="<%=resume.getBirthPlace()%>"/><br/>
    自我评价：<input id="evaluate" type="text" name="evaluate" value="<%=resume.getEvaluate()%>"/><br/>
    身份证号：<input id="idCard" type="text" name="idCard" value="<%=resume.getIdCard()%>"/><br/>
    电话号码：<input id="phone" type="text" name="phone" value="<%=resume.getPhone()%>"/><br/>
    电子邮箱：<input id="email" type="text" name="email" value="<%=resume.getEmail()%>"/><br/>
    <input type="submit" value="确认修改">
</form>
</body>
</html>