<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
<%@page import="demo.utils.UploadUtils" %>
<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>上传处理页面</title>
</head>
<body>
<%-- 



文件上传工具类

1、无数据库表路径信息只能上传不能显示
2、文件名用的是上传的原始文件名，导致会出现重复覆盖现象
3、无法限制只能上传图片，没有做文件类型判断
4、无法限制上传文件的大小
5、一般upload/不能写死在代码里，应该在配置中配置，要配置绝对文件地址  
 --%>

<%
request.setCharacterEncoding("utf-8");
UploadUtils upload = new UploadUtils();
String[] result = upload.uploadFile(request);
for(String s:result){
	out.print(s + "<br/>");
}

out.print("<img src='" +result[4] + "' />");

%>



</body>
</html>

