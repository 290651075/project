<%--
  Created by IntelliJ IDEA.
  User: Show
  Date: 2018/7/22
  Time: 16:11
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
    <script type="text/javascript">
        function check() {
            if (document.getElementById('name').value==""||document.getElementById('pass').value==""){
                alert('账号和密码不能为空！');
                document.getElementById('name').focus();
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form method="post" action="register" onsubmit="return check()">
    账号：<input id="name" type="text" name="name"/><br/>
    密码：<input id="pass" type="password" name="pass"/><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
