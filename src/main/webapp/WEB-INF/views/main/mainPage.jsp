<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="../common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<script type="text/javascript">
	function goLogin(){
		submit($("#form1"), "/login/loginPage.do");
	}
</script>
</head>
<body>
	<form id="form1">
	</form>
	<img src="${pageContext.request.contextPath}/img/main_back1.jpeg" style="width:1425px;height:500px;">
	<input type="button" value="log in" onClick="goLogin()" />
</body>
</html>