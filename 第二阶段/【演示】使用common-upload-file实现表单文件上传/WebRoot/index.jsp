<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File控件文件上传</title>
</head>
<body>

<form action="index2.jsp" method="post" enctype="multipart/form-data">
<p>姓名：<input type="text" name="user"></p>
<p>选择图片（身份证）：<input type="file" name="nfile"></p>
<p><input type="submit" value="提交"></p>
</form>

</body>
</html>