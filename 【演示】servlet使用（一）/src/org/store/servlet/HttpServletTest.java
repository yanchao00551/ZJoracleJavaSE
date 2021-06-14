package org.store.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class HttpServletTest extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//在Tomcat中配置URIEncoding解决GET方式的中文乱码，代码中不在做处理
		String uName = req.getParameter("username");
		if(uName == null) {
			uName = "游客";
		}
		
		//设置响应内容的类型并指定字符集，以免浏览器展示中文内容时出现乱码
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println(" <head><title>Servelt</title></head>");
		out.println(" <body> ");
		out.println("你好，欢迎" + uName + "来到Servlet世界");
		out.println("</html>");
		out.flush();
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
