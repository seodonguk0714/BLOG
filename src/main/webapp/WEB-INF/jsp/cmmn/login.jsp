<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>커스텀 로그인 페이지</h1>
    <form action="/login" method="post">
        아 이 디 : <input type="text" name="userId"/><br />
        비밀번호 : <input type="text" name="userPassword"/><br />        
        <sec:csrfInput/>
        <input type="submit" value="로그인"/>
    </form>
	<c:if test="${param.error }">
		<font color="red">로그인 실패</font>
    </c:if>
</body>
</html>