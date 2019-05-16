<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>框架测试</title>
<link rel="stylesheet" type="text/css"
	href="../jquery-easyui-1.4.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../jquery-easyui-1.4.3/themes/icon.css">
<script type="text/javascript"
	src="../jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="../jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../js/index.js"></script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">north
		region</div>
	<div data-options="region:'west',split:true,title:'菜单'"
		style="width: 150px; padding: 10px;">west content</div>
<!-- 	<div -->
<!-- 		data-options="region:'east',split:true,collapsed:true,title:'East'" -->
<!-- 		style="width: 100px; padding: 10px;">east region</div> -->
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">south
		region</div>
	<div data-options="region:'center',title:'内容'">
		<div id="mainTab" class="easyui-tabs" fit="true" border="false">
			<div title="首页" style="padding: 3px 3px 0px 3px;" data-options="closable:true">
				<!-- 添加要展示的首页数据 -->
				<div style="padding: 10px; margin: 5px;">
					<form action="<%=basePath%>user/login.action" method="post"
						id="userlogin">
						<span>用户名 : </span><input type="text" name="username"
							class="easyui-textbox" data-options="iconCls:'icon-man'"
							style="width: 100px" id="username" /><br> <br>
						<span>密 码 : </span><input type="password" name="password"
							id="password" class="easyui-textbox"
							data-options="iconCls:'icon-lock'" style="width: 100px" /><br>
						<br> <input type="button" id="Login" value="登录"
							onclick="submitForm()" /> <input type="reset" value="重置"
							id="Cancel" />
					</form>
				</div>
				
			</div>
			<div title="asdfs" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			<div title="FDSF" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			<div title="VXV" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			<div title="XCVZV" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			<div title="FAFAF" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			<div title="FAAEF" data-options="closable:true" style="padding: 3px 3px 0px 3px;"></div>
			
			
			
		</div>
</body>
</html>