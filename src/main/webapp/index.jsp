<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>启动成功</h3>
<a href="account/findAll">测试查询</a>
<h3>测试保存</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="username">
    金额：<input type="text" name="money">
    <input type="submit" value="提交">
</form>
</body>
</html>
