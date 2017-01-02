<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function checkForm(){
			var name = document.getElementById("name").value;
			var no =      document.getElementById("no").value;
			if( name == ""){
				alert("商品名称不能为空");
				return false;
			}
			if(no == ""){
				alert("商品编号不能为空");
				return false;
			}
			return true;
		}
	</script>
  </head>
  
  <body>  	
  <div style="font-size: 14px; color: red; text-align: center"> <s:fielderror /> </div>
  <form action="productAction_saveProduct" name="form1" method="post" onsubmit="return checkForm();">
  	产品名称:<input type="text" name="name" id="name"><br/>
  	产品编号:<input type="text" name="no" id="no"><br/>
  	产品价格:<input type="text" name="price"><br/>
  	生产日期:<input type="text" name="date"><br/>
    <input type="submit" value="添加">
  </form>
  
  <h3>删除方法</h3>
  传参数:<a href="productAction_deleteProduct?no=1001">删除产品</a><br/>
  无参数:<a href="productAction_deleteProduct">删除产品</a><br/>
  
  <h3>XML文件校验基本属性</h3>
  
 	<s:form action="productAction_saveProduct">
 		<s:textfield name="name" label="用户名称"/>
 		<s:textfield name="age" label="用户年龄"/>
 		<s:textfield name="myprice" label="商品价格"/>
 		<s:textfield name="date" label="生产日期"/>
 		<s:submit value="注册"/>
 	</s:form>
 <h3>XML文件校验对象属性</h3>
 <s:form action="productAction_saveProduct">
		 <s:textfield name="product.name" label="商品名称"/>
 		<s:textfield name="product.birth" label="生产日期"/>
 		<s:submit value="注册"/>
 	</s:form>
 	  <h3>删除方法XML文件校验</h3>
  传参数:<a href="deleteProduct?no=1001">删除产品</a><br/>
  无参数:<a href="deleteProduct">删除产品</a><br/>
  </body>
</html>
