<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Game.Beans" %>
<% Beans B = (Beans)request.getAttribute("B"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=B.getLevel() %>
<%=B.getResult() %>
<%=B.getTensu() %>


</body>
</html>