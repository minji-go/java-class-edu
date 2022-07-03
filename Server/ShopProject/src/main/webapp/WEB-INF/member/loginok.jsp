<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MJSHOES</title>
<%@ include file="/WEB-INF/inc/asset.jsp" %>
<style>

</style>
</head>
<body>
	
	 <main>
		<%@ include file="/WEB-INF/inc/header.jsp" %>
	 	<section>
	 	</section>
	 </main>
	
	<script>
		<c:if test="${not empty auth}">
			location.href='/shop/index.do';
		</c:if>
		<c:if test="${empty auth}">
			alert('Sorry, your request cannot be accepted.');
			history.back();
		</c:if>
		
	</script>
	
</body>
</html>