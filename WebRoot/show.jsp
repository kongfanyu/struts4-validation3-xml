<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
<title>校验成功</title>
</head>
<body>
<H3>校验成功</H3>
用户名：<s:property value="user.name"/><br>
密码：<s:property value="user.pass"/><br>
年龄：<s:property value="user.age"/><br>
生日：<s:property value="user.birth"/><br>
</body>
</html>