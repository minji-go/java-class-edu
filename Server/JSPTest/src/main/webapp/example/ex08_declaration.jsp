<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.test.jsp.Util"%>
    
<% 
	//스클립트릿 > 메소드 안 > 메소드 영역
	
	//자바 영역 > 우리가 생각하는 평범한 자바 영역이 아니다.
	/* 
		public int sum(int a, int b) {
			return a + b;
		} 
	*/
	
	//변수 종류: 클래스 멤버 변수? or 지역변수?
	int a = 10; //지역 변수
	
	Util util = new Util();
	
%>
<%!
	//선언부 > 클래스 안 > 클래스 영역
	public int b = 20; //클래스 멤버 변수
	
	public int sum(int a, int b) {
		return a + b;
	} 
%>  <!-- 잘 사용하지 않음 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>선언부</h1>
	
	<div>sum(10, 20) = <%= sum(10, 20) %></div>
	<div>sum(100, 200) = <%= sum(100, 200) %></div>
	
	<hr>
	<div>util.sum(10, 20) = <%= util.sum(10, 20) %></div>
	
</body>
</html>




















