<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<body>
	<table style="border: 1px solid black;" >
		<tr>
			<th>순번</th>
			<th>제목</th>
			<th>작성자</th>
			<th>내용</th>
		</tr>
		<c:forEach items="${boardList }" var="list" varStatus="i">
		<tr>
			<td>${list.seq }</td>
			<td>${list.title }</td>
			<td>${list.writer }</td>
			<td>${list.content}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>