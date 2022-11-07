<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> lists = new ArrayList<>();
	lists.add("리스트");
	lists.add("컬렉션");
	session.setAttribute("lists", lists);
%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
</head>
<body>
	<h2>페이지 이동 후 session 영역의 속성 읽기</h2>
	<%
		ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists");
		for (String str : lists)
			out.println(str +"<br/>");
	%>
</body>
</html>