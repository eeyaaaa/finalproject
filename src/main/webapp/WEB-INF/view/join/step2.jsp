<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/join.js" charset="UTF-8"></script>

</head>
<body>

	<form action="/step3">
		아이디(Email) <input type="email" class="join">
		<input type="button" id="emailCheck" value="중복확인"> 
		<br> 
		닉네임 <input type="text" class="join"> <input type="button" value="중복확인">
		<br>
		비밀번호 <input type="password" id="password1" class="join"> <br>
		비밀번호 확인 <input type="password" id="password2" class="join"> <br>
		생년월일 <input type="text" id="year" class="join">
		 <select id="month" class="join">
			<option value="">월</option>
			<%for(int i = 1; i>=12; i++){%>
			<option value="<%=i %>"><%=i %>월</option>
			<%} %>
		</select> 
		<select id="day" class="join">
			<option value="">일</option>
			<%for(int i = 1; i>=31; i++){%>
			<option value="<%=i%>"><%=i %> 일</option>
			<%} %>
		</select> 
		<br> 
		휴대폰 번호 <input type="text" class="join">
		<input type="button" value="중복확인"> <br> 
		인증번호 입력 <input type="text" class="join"> 
		<br>
		<br> 
		<input type="submit" value="가입하기">

	</form>
</body>
</html>