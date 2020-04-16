<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/newLogin.css" />
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.0.js"></script>
		<script type="text/javascript">	
		var bo=0;
		var count;
			$(document).ready(function(){
				count=$("#bo").children().length;
				$("#bo > *").hide();
				$("#bo").children().eq(0).show();

				setInterval("auto()",2000)
			})
			function auto(){
				bo = addnum();
				$("#bo > *").hide();
				$("#bo").children().eq(bo).show();
				
			}
		
			function addnum(){
				if(bo+1<count){
					bo=bo+1;
				}
				else{
					bo=0;
				}
				return bo;
			}	
			function cl(){
				$("#message").text("");
			}
			function check(){
				var username = $("#username").val();
				var password = $("#password").val();
				if(username==""||password==""){
					$("#message").text("账号或密码不能为空！");
					return false;
				}
				return true;
			}
		</script>
		
</head>
<body>
		<div class="mBox">
			
			<div class="lBox" id="bo">
				<div class="lunbo1" id="bo1"></div>
				<div class="lunbo2" id="bo2"></div>
				<div class="lunbo3" id="bo3"></div>
				<div class="lunbo4" id="bo4"></div>
			</div>
			
			<div class="rBox">
				
				<nav>
					<ul>
					</ul>
				</nav>
				
				<div class="welcom">
					<span class="p1">欢迎注册</span>
					<br />
					<span class="p2">每一天，乐在交流。</span><br><br>
					<span class="p3" id="message">${msg }</span>
				</div>
				
				<div class="loginBox">
					<form action="${pageContext.request.contextPath }/register" method="post" onsubmit="return check()">
						<input type="text" name="loginName" id="username" placeholder="用户名" ><br/><br/><br/>
						<input type="password" name="loginPassword" id="password" placeholder="密码" /><br/><br/><br/>
						<input type="text" name="empId" id="empId" placeholder="员工编号" /><br/><br/><br/>
						<input type="submit" class="submit" id="sub" value="立即注册" />
					</form>
				</div>
			</div>
		
		</div>
</body>
</html>