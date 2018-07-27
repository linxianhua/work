<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<from:form action="xiugaiFly.fc" method="put" commandName="chaid">

              <from:hidden path="fid"/><br/>
        航线名称：<from:input path="fname"/><br/>
        起飞城市：<from:input path="gcity"/><br/>
        到达城市：<from:input path="tcity"/><br/>
        出发时间：<from:input path="ftime"/><br/>
   <input type="submit" value="修改">
</from:form>



</body>
</html>