<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>表格</title>
<base href="<%= request.getServletContext().getContextPath()%>/">
<link rel="shortcut icon" href="img/favicon.ico">
<!-- Bootstrap3.3.5 CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- datatime -->
<link href="bootstrap/css/bootstrap-datetimepicker.min.css"
	rel="stylesheet">
<link href="css/main.css" rel="stylesheet">

</head>

<body>
	<div class="row">
		<jsp:include page="../header.jsp"></jsp:include>
		<div id="content" class="col-md-10 col-xs-10 col-sm-10" style="padding-top: 0; margin: 0;">


			<div id="personaldiv">
				<form class="form-horizontal" action="changePass" method="post"
					enctype="multipart/form-data">
					<fieldset>
						<legend>修改密码</legend>
						<input type="hidden" name="id" value="${login.id }" />
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">用户名:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="text" name="name" class="form-control" value="${login.loginName }"  readonly="readonly">
								<span class="glyphicon glyphicon-user form-control-feedback"></span>
							</div>
	
						</div>
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">旧密码:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="password" name="oldPassword" class="form-control">								
							</div>
						</div> 
						
						
						<div class="form-group has-feedback">
							<label class="control-label col-md-2 col-xs-2 col-sm-2">新密码:</label>
							<div class="col-md-4 col-xs-4 col-sm-4">
								<input type="password" name="newPassword" class="form-control">
							</div>
	
						</div> 
						
					<div class="form-group col-md-7 col-xs-7 col-sm-7"
						style="text-align: center;">
						<span>${msg }</span><br/>
						<input type="submit" class="btn btn-success" value="提 交" />
					</div>
											
														
				</form>
			</div>
		</div>
	</div>
	<script src="js/jquery-3.2.1.min.js "></script>
	<script src="bootstrap/js/bootstrap.min.js "></script>
	<script type="text/javascript" src="js/date.js"></script>
	<script type="text/javascript"
		src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
	<script type="text/javascript"
		src="bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
	<script type="text/javascript" src="js/menu.js"></script>
	<script>
		$(function() {
			$('#datetimepicker').datetimepicker({
				format : 'yyyy-mm-dd',
				autoclose : true,
				minView : 2
			});
		});
	</script>
</body>

</html>

