package com.skeyedu.mall.web.pre;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.entity.Product;
import com.skeyedu.mall.param.ProductParams;
import com.skeyedu.mall.service.news.NewsService;
import com.skeyedu.mall.service.news.impl.NewsServiceImpl;
import com.skeyedu.mall.service.product.ProductCategoryService;
import com.skeyedu.mall.service.product.ProductService;
import com.skeyedu.mall.service.product.impl.ProductCategoryServiceImpl;
import com.skeyedu.mall.service.product.impl.ProductServiceImpl;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.utils.ProductCategoryVo;
import com.skeyedu.mall.web.AbstractServlet;


@WebServlet(urlPatterns = {"/Home"}, name = "Home")
public class HomeServlet extends AbstractServlet{

	
	private ProductService productService;
	private NewsService newsService;
	private ProductCategoryService productCategoryService;
	
	
	private static final long serialVersionUID = 1L;




	/**
	 * 进入doGet和doPost之前执行该方法，用作初始化
	 */
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		productService = new ProductServiceImpl();
		newsService = new NewsServiceImpl();
		productCategoryService = new ProductCategoryServiceImpl();
	}
	
	
	
	
	/**
	 * 商城主页方法,这是localhost:8080/servlet_2/Home?action=index
	 * 执行，通过反射机制 执行 index()方法
	 */
	public String index(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//查询商品分类
		List<ProductCategoryVo> productCategoryVoList = productCategoryService.queryAllProductCategoryList();
		
		
		
		//查询所有新闻
		List<News> news = newsService.getAllNews(new Pager(5,5,1));
		
		
		
		//查询一楼
        for (ProductCategoryVo vo : productCategoryVoList) {
        	ProductParams params = new ProductParams();
        	params.setCategoryId(vo.getProductCategory().getId());
        	params.openPage(0,7);
            List<Product> productList = productService.queryProductsList(params);
            vo.setProductList(productList);
        }
        
		
		//封装返回
		request.setAttribute("news", news);
		request.setAttribute("productCategoryVoList", productCategoryVoList);
		
		return "/pre/index";
	}
	
	
	

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return HomeServlet.class;
	}
	

}
