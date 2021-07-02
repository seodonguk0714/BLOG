<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/js/cmmn/cmmn.js"></script>
</head>
<body>
<h2>메인화면 입니다</h2>
<table id="table" border="1"></table>
<form action="/logout" method="post">
<sec:csrfInput/>
<button type="submit">logout</button>
</form>
</body>
</html>