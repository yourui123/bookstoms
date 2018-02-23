<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>系统登录</title>
<style type="text/css">
	div{
		border:1px red solid;
		width:300px;
		height:200px;
		margin:0 auto;
	}
</style>
</head>
<body>
	<form action="/login" method="post">
		<div>
			<b>欢迎登陆**系统</b><hr/>
			<p>用户名：</p><input type="text" name="username" />
			<p>密码：</p><input type="password" name="userpwd" />
			<input type="submit" value="登陆"/>
		</div>
	</form>
</body>
</html>