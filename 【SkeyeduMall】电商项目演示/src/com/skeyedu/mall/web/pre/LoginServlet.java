package com.skeyedu.mall.web.pre;

import java.io.IOException;
import java.util.Date;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.service.user.UserService;
import com.skeyedu.mall.service.user.impl.UserServiceImpl;
import com.skeyedu.mall.utils.EmptyUtils;
import com.skeyedu.mall.utils.ReturnResult;
import com.skeyedu.mall.utils.SecurityUtils;
import com.skeyedu.mall.web.AbstractServlet;




@WebServlet(urlPatterns = { "/Login" }, name = "Login" ,asyncSupported=true)
public class LoginServlet extends AbstractServlet{
	

	private static final long serialVersionUID = 1L;
	
	
	//注入用户业务类
    private UserService userService;

    public void init() throws ServletException {
        userService = new UserServiceImpl();
    }
    /**
     * 重写相关方法
     * @return
     */
    @Override
    public Class getServletClass() {
        return LoginServlet.class;
    }
    /**
     * 跳转到登陆界面
     * @param request
     * @param response
     * @return
     */
    public String toLogin(HttpServletRequest request,HttpServletResponse response)throws Exception{
        return "/pre/login";
    }
    /**
     * 登陆的方法
     * @param request
     * @return
     */
    public ReturnResult login(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ReturnResult result=new ReturnResult();
        //参数获取
        String loginName=request.getParameter("loginName");
        String password=request.getParameter("password");
        User user=userService.findByLoginName(loginName);
        if(EmptyUtils.isEmpty(user)){
            result.returnFail("用户不存在");
        }else{
           if(user.getPassword().equals(SecurityUtils.md5Hex(password))){
        	   //业务逻辑 登录日志
      		   AsyncContext context = request.startAsync(request, response);
        	   context.setTimeout(0);  //设置响应超时时间
        	   context.complete();  //返回响应结果
        	   request = (HttpServletRequest) context.getRequest();
        	   response = (HttpServletResponse) context.getResponse();
        	   //servlet异步开启一个线程
        	   
        	   System.out.println("Servlet执行开始时间：" + new Date());
        	   
        	   Thread t = new Thread(new Excutor(context,user));
        	   t.start();
        	   
        	   System.out.println("Servlet执行结束时间: " + new Date());
               //登陆成功
        	   request.getSession().setAttribute("loginUser", user);
               result.returnSuccess("登陆成功");
               
           }else{
               result.returnFail("密码错误");
           } 
        }
        return result;
    }
    
    
    //开启一个线程类 （内部类)
    public class Excutor implements Runnable{
    	private AsyncContext context;
    	private User user;

		public Excutor(AsyncContext context,User user) {
			// TODO Auto-generated constructor stub
			this.context = context;
			this.user = user;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			//正常是调用Service业务逻辑  执行相关的复杂逻辑
			//停留10秒
			//userService.addLoginLog(user);
		
		    System.out.println("业务执行完成时间：" + new Date());
		}
    }
    
    /**
     * 登陆的方法
     * @param request
     * @return
     */
    public String loginOut(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ReturnResult result=new ReturnResult();
        try {
            User user=(User)request.getSession().getAttribute("loginUser");
            request.getSession().removeAttribute("loginUser");
            // 清除购物车
            request.getSession().removeAttribute("cart");
            request.getSession().removeAttribute("cart2");
        } catch (Exception e) {
            e.printStackTrace();
        }
        result.returnSuccess("注销成功");
        return "/pre/login";
    }
}
