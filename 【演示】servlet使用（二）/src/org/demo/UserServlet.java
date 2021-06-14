package org.demo;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.entity.User;


public class UserServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("register.jsp").forward(req, resp);
	}

	
	
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//从请求参数中取得用户名
		String userName = req.getParameter("userName");
		//密码
		String password = req.getParameter("password");
		//业余爱好
		String[] habits = req.getParameterValues("habit");
		
		
		
		//假设 此数据是Service层的返回 ，此处生成一个User对象
		User user = new User();
		user.setName(userName);
		user.setPassword(password);
		user.setHabits(Arrays.asList(habits));
		
		
		req.setAttribute("userObj", user); //把要返回给页面的数据设置在request对象中
		
		
		req.getRequestDispatcher("/regSuccess.jsp").forward(req, resp);
	}

}
