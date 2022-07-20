<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="../common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<form id="form1">
	</form>
	<img src="${pageContext.request.contextPath}/img/main.jpeg" style="width:1425px;height:500px;">
	<br>
	<input type="button" value="Go Login" onClick="goLogin()" />
	
	<script type="text/javascript">
		function goLogin(){
			submit($("#form1"), "/login/loginPage.do");
		}
	</script>
</body>
</html>