package org.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.demo.entity.User;
import org.demo.utils.PrintUtil;
import org.demo.utils.R;
import org.demo.utils.UploadUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class UserServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;





	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//第一种提交
		String username = req.getParameter("username").trim(); 
		String password = req.getParameter("password").trim();
		  
		System.out.println("接收参数username：" + username);
		System.out.println("接收参数password：" + password);
		
		R r = new R();
		
		//最终从 service层拿到的数据结果
		List<User> userList = new ArrayList<User>();
		userList.add(new User("admin","123"));
		userList.add(new User("zhang3","456"));
		int total = 20;
		
		//1行解决返回值
		r.setTotal(total);
		r.returnSuccess(userList);
		
		//1行解决  javabean转json字符串
		
		
		//String json = "{\"status\":0,\"msg\":\"操作成功\"}";
		//System.out.println(json);
		
		PrintUtil.write(r, resp);

		 

		//第二种提交 FormData 支持Ajax文件上传 需要用到apache comomon-file-upload jar包
		
		//方式一：不用工具类
		
//		DiskFileItemFactory factory = new DiskFileItemFactory();
//		ServletFileUpload upload = new ServletFileUpload(factory);
//		String username = "";
//		String password = "";
//		try {
//			List<FileItem> items = upload.parseRequest(req);
//			for(FileItem item:items) {
//				if(item.isFormField()) {
//					if("username".equals(item.getFieldName())) {
//						username = item.getString("UTF-8");
//					}else if("password".equals(item.getFieldName())) {
//						password = item.getString("UTF-8");
//					}
//				}else {
//					//图片上传逻辑
//					
//				}
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("接收参数：" + username);
//		System.out.println("接收参数：" + password);
		
		
	  //方式二：使用工具类 、实现Ajax文件上传
		
//	  UploadUtils upl = new UploadUtils();
//	  upl.setSavePath("D:/working1/login3/WebRoot/" + upl.getBasePath() + "/");
//	  String[] result = upl.uploadFile(req); 
//	  Map<String,String> fields =upl.getFoList(); 
//	  System.out.println("用户名：" + fields.get("username")); 
//	  System.out.println("密码：" +fields.get("password"));
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  /*微服务ajax 提交方式 */
//		  String param= null; 
//		  BufferedReader streamReader = new BufferedReader( new InputStreamReader(req.getInputStream(), "UTF-8")); 
//		  StringBuilder responseStrBuilder = new StringBuilder(); 
//		  String inputStr; 
//		  while ((inputStr =  streamReader.readLine()) != null) 
//			  responseStrBuilder.append(inputStr);
//		 
//		  JSONObject jsonObject = JSONObject.parseObject(responseStrBuilder.toString()); 
//		  User user = JSON.toJavaObject(jsonObject, User.class);
//		  
//
//		  System.out.println(user);
		  
		  
		 
		
		
		
	}

}
