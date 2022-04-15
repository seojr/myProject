<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file ="../common/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
</head>
<body>
	<form id="form1">
		<input type="search" name="usrId" placeholder="ID"/><!--ID -->
		<input type="search" name="usrNm" placeholder="이름"/><!-- 이름 -->
		<input type="password" name="bytePwd" placeholder="비밀번호"/><!-- 비번 -->
		<input type="date" name="birthYmd" placeholder="생년월일"/><!--  생년월일 -->
		<input type="search" name="email" placeholder="이메일"/><!-- 이메일 -->
		<input type="search" name="address" placeholder="주소"/><!-- 주소 -->
		<input type="search" name="education" placeholder="최종 학력"/><!-- 최종 학력 -->
		<input type="search" name="hpNo" placeholder="휴대폰 번호"/> <!-- 핸드폰 번호 -->
		<input type="button" value="회원가입" onClick="doJoin();"/>
	</form>
	<script type="text/javascript">
		function doJoin(){
			submit($("#form1"), "/login/join.do");
		}
	</script>
</body>
</html>