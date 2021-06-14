package com.skeyedu.mall.web.backend;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.param.NewsParams;
import com.skeyedu.mall.service.news.NewsService;
import com.skeyedu.mall.service.news.impl.NewsServiceImpl;
import com.skeyedu.mall.service.product.ProductService;
import com.skeyedu.mall.service.product.impl.ProductServiceImpl;
import com.skeyedu.mall.utils.EmptyUtils;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.web.AbstractServlet;

@WebServlet(urlPatterns = {"/admin/news"},name = "adminNews")
public class AdminNewsServlet extends AbstractServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return AdminNewsServlet.class;
	}

    private NewsService newsService;
	
	private ProductService productService;

	public void init() throws ServletException {
		this.newsService = new NewsServiceImpl();
		this.productService = new ProductServiceImpl();
	}
	
	/**
	 * 查询新闻列表
	 * @param request
	 * @param response
	 * @return
	 */
	public String queryNewsList(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		
		//获取当前页数
		String currentPageStr = request.getParameter("currentPage");
		//获取页大小
		String pageSize = request.getParameter("pageSize");
		int rowPerPage = EmptyUtils.isEmpty(pageSize)?10:Integer.parseInt(pageSize);
		int currentPage = EmptyUtils.isEmpty(currentPageStr)?1:Integer.parseInt(currentPageStr);
		int total=newsService.queryNewsCount(new NewsParams());
		Pager pager=new Pager(total,rowPerPage,currentPage);
		pager.setUrl("/admin/news?action=queryNewsList");
		List<News> newsList = newsService.getAllNews(pager);
		request.setAttribute("newsList", newsList);
		request.setAttribute("pager", pager);
		request.setAttribute("menu", 7);
		return "/backend/news/newsList";
		
	}
	
	
	/**
	 * 
	 * 查询新闻详情
	 * @param request
	 * @param response
	 * @return
	 */
	public String newsDeatil(HttpServletRequest request,HttpServletResponse response)throws Exception{
		String id = request.getParameter("id");
		News news=newsService.findNewsById(id);
		request.setAttribute("news",news);
		request.setAttribute("menu", 7);
		return "/backend/news/newsDetail";
	}
	
	
	
}
