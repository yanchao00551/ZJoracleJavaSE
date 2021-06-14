<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%

   String req = "request";
   String ses = "session";
   request.setAttribute("reqName",req);
   session.setAttribute("sessionName",ses);
   response.sendRedirect("testTwo.jsp");
%>

</body>
</html>