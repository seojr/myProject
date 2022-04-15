<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="../common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>log in</title>
</head>
<body>
	<form id="form1">
		<div>
			<input type="search" name="usrId" placeholder="ID" />
			<input type="password" id="pwd" name="bytePwd" placeholder="PW" />
			<input type="button" value="login" onClick="doLogin();" />
		</div>
		<div>
			<input type="button" value="Go Join" onClick="goJoin();" />
		</div>
	</form>
	
	<script type="text/javascript">
		let pwdInputDom = document.getElementById('pwd');
		
		pwdInputDom.addEventListener('keyup', (event) => {
			if(event.keyCode === 13)
				doLogin();
		});
		
		function doLogin(){
			submit($("#form1"), "/login/login.do");
		}
		
		function goJoin(){
			submit($("#form1"), "/login/joinPage.do");
		}
	</script>
</body>
</html>