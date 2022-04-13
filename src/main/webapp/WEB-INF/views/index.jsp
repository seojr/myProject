<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Welcome to PIANO PLATFORM</title>
<meta charset="UTF-8">
<script type="text/javascript">
	$(function(){
		submit($("#form1"), "/main/mainPage.do");
	});
</script>
</head>
<body>
	<form id="form1">
	</form>
</body>
</html>