<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 / 비밀번호 찾기</title>
<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
</head>
<body>

새로운 비밀번호를 입력하세요.
<br><br>
찾으신 이메일은 : ${sessionScope.myEmail} 입니다.
<br><br>
새 비밀번호 <input type="password" id="password1" class="password" placeholder="새 비밀번호" required > <br>
새 비밀번호 확인 <input type="password" id="password2" class="password" placeholder="새 비밀번호 확인 " required >
<div style="display:inline" id="alert-wrong">새 비밀번호가 일치하지 않습니다.</div>
<br>
<input type="button" id="updatePwdBtn" value="비밀번호 변경">

<script src="${pageContext.request.contextPath}/js/mypage.js" charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/js/join.js" charset="UTF-8"></script>
</body>
</html>