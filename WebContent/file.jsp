<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="add.jsp">添加</a>
	<table border="1" width="800">

		<tr align="center">
			<td>航线编号</td>
			<td>航线名称</td>
			<td>起飞城市</td>
			<td>到达城市</td>
			<td>航线日期</td>
			<td>起飞时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${fly}" var="fly">
			<tr align="center">
				<td>${fly.fid}</td>
				<td>${fly.fname}</td>
				<td>${fly.gcity}</td>
				<td>${fly.tcity}</td>
				<td>${fly.fdate}</td>
				<td>${fly.ftime}</td>
				<td><a href="shanchu.fc?fid=${fly.fid}">删除</a><a href="xiugai.fc?fid=${fly.fid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>