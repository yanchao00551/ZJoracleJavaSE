<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加cookie</title>
</head>
<body>

<%

Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(int i=0; i<cookies.length; i++){
		out.print("cookie name:" + cookies[i].getName());
		out.print("<br/>");
		out.print("cookie value:" + cookies[i].getValue());
		out.print("<br/>");
	}
}

%>
</body>
</html>