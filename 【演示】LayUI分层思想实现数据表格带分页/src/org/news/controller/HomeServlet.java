package org.news.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.news.entity.NewsUser;
import org.news.service.NewsService;
import org.news.util.PrintUtil;
import org.news.util.ReturnResult;

public class HomeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = req.getParameter("page");
		String pageSize = req.getParameter("limit");
		
		if( page == null || page.equals("")) {
			page = "1";
		}
		
		if( pageSize == null || pageSize.equals("") ) {
			pageSize = "10";
		}
		
		
	   NewsService newService = new NewsService();
	   Map<String,Object> map = newService.queryNewsList(Integer.parseInt(page), Integer.parseInt(pageSize));
		
		
	  //返回给前端,第一步取出数据
		
	  Set<Entry<String, Object>> setResult = map.entrySet();
	  Iterator<Entry<String,Object>> itr = setResult.iterator();
	  List<NewsUser> list = new ArrayList<>();
	  Object list2 = null;
	  int size = 0;
	  while(itr.hasNext()){
		    Entry<String,Object> entry = itr.next();
		    if(entry.getKey().equals("list")){
		    	list2 = entry.getValue();
		    }
		    if(entry.getKey().equals("count")){
		    	size = Integer.parseInt((String)entry.getValue());
		    }
	  }
	  
	  
	  if(list2 instanceof ArrayList<?>) {
			for(Object o:(List<?>)list2) {
				list.add(NewsUser.class.cast(o));
			}
	  }
			
       //利用io流写给前端
	  ReturnResult result = new ReturnResult();
	  result.setTotal(size);
	  result.returnSuccess(list);
	  PrintUtil.write(result, resp);
	  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
	
}
