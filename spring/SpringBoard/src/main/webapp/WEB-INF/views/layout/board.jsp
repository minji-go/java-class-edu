<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<tiles:insertAttribute name="asset" />
</head>
<body>

	<main>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="content" />
	</main>
	
</body>
</html>