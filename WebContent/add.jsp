<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="tianjia.fc" method="post">
	
	航线编号：<input type="text" name="fid" value=""/><br/>
	航线名称：<input type="text" name="fname" value=""/><br/>
	起飞城市：<input type="text" name="gcity" value=""/><br/>
	到达城市：<input type="text" name="tcity" value=""/><br/>
	出发时间：<input type="text" name="ftime" value=""/><br/>
	<input type="submit" value="添加">
	
	</form>

</body>
</html>