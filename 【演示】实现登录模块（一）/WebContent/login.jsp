<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
     String path = request.getContextPath();
     String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
     
     
     String methodName = request.getMethod();   
     if(methodName.equals("POST")){   //如果是POST才执行
    	 String name = request.getParameter("userName");
    	 String pwd = request.getParameter("pwd");
    	 if ("sa".equals(name) && "sa".equals(pwd)) {
    		 response.sendRedirect("welcome.jsp");
    	 }
     }

%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录验证1Insert title here</title>
</head>
<body>
<form action="./control.jsp" method="post">
   <label>用户名：</label> <input type="text" name="userName"><br/>
   <able>密码：</label>   <input type="password" name="pwd"><br/>
   
   <input type="submit" value="登录"/>
</form>

</body>
</html>