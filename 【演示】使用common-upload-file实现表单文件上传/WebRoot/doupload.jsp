<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*" %>
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
String uploadFileName = "";      //上传的文件名
String fieldName = "";           //表单字段元素的name属性值
//请求信息中的内容是否是multipart类型
boolean isMultipart = ServletFileUpload.isMultipartContent(request);
//上传文件的存储路径（服务器文件系统上的绝对文件路径）
String uploadFilePath = "D:/working1/upload/WebRoot/upload";
out.print(uploadFilePath);
if(isMultipart){
	FileItemFactory factory = new DiskFileItemFactory();
	ServletFileUpload upload = new ServletFileUpload(factory);
	try{
		//解析form表单中所有文件
		List<FileItem> items = upload.parseRequest(request);
		Iterator<FileItem> iter = items.iterator();
		while(iter.hasNext()){
			FileItem item = (FileItem)iter.next();
			if(item.isFormField()){  //判断是否是普通表单字段
				fieldName = item.getFieldName();   //取表单字段的name属性值
				
				if(fieldName.equals("user")){
					//输出表单字段的值
					out.print(item.getString("UTF-8") + "上传了文件。<br/>");
				}
			}else{
				fieldName = item.getFieldName();
				if(fieldName.equals("nfile")){  //文件表单字段
					String fileName = item.getName();  //文件名，原始文件名
					if(fileName != null && !fileName.equals("")){
						File fullFile = new File(item.getName());
						File saveFile = new File(uploadFilePath,fullFile.getName());
						item.write(saveFile);
						uploadFileName = fullFile.getName();
						out.print("上传成功后的文件名是：" + uploadFileName);
					}
				}
			}
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	
}



%>
</body>
</html>

