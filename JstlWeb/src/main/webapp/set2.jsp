<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="kr.co.ezenac.utils.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	ArrayList<Person> pList = new ArrayList<>();
	pList.add(new Person("신사임당", 20));
	pList.add(new Person("이방원", 10));
%>
<%
	Map<String, Person> pMap = new HashMap<>();
	pMap.put("Person1", new Person("신사임당1", 11));
	pMap.put("Person2", new Person("이방원1", 12));
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>JSTL - set</title>
</head>
<body>
	<h4>List 컬렉션 이용</h4>
	
	<c:set var="personList" value="<%= pList %>" scope="request" />
	<ul>
		<li>이름 : ${requestScope.personList[0].name } </li>
		<li>나이 : ${personList[0].age }</li>
	</ul>
	
	<h4>Map 컬렉션 이용</h4>
	<c:set var="personMap" value="<%=pMap %>" scope="request" />
	<ul>
		<li>이름 : ${requestScope.personMap.Person1.name } </li>
		<li>나이 : ${personMap.Person2.age }</li>
	</ul>
</body>
</html>