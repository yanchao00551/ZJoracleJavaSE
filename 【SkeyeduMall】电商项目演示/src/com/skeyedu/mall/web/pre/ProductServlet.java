package com.skeyedu.mall.web.pre;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.skeyedu.mall.entity.Product;
import com.skeyedu.mall.service.product.ProductCategoryService;
import com.skeyedu.mall.service.product.ProductService;
import com.skeyedu.mall.service.product.impl.ProductCategoryServiceImpl;
import com.skeyedu.mall.service.product.impl.ProductServiceImpl;
import com.skeyedu.mall.utils.EmptyUtils;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.utils.ProductCategoryVo;
import com.skeyedu.mall.web.AbstractServlet;

@WebServlet(urlPatterns = {"/Product"}, name = "Product")
public class ProductServlet extends AbstractServlet{


	private static final long serialVersionUID = 1L;

	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return ProductServlet.class;
	}
	
	
	private ProductService productService;
    private ProductCategoryService productCategoryService;


    public void init() throws ServletException {
        productService = new ProductServiceImpl();
        productCategoryService=new ProductCategoryServiceImpl();
    }
    
    /**
     * 查询商品列表
     *
     * @param request
     * @param response
     * @return
     */
    public String queryProductList(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String category = request.getParameter("category");
        String levelStr = request.getParameter("level");
        String currentPageStr = request.getParameter("currentPage");
        String keyWord = request.getParameter("keyWord");
        //获取页大小
        String pageSizeStr = request.getParameter("pageSize");
        int rowPerPage = EmptyUtils.isEmpty(pageSizeStr) ? 20:Integer.parseInt(pageSizeStr);
        int currentPage = EmptyUtils.isEmpty(currentPageStr) ? 1 : Integer.parseInt(currentPageStr);
        int  level=EmptyUtils.isNotEmpty(levelStr)?Integer.parseInt(levelStr):0;
        int total = productService.getProductRowCount(category,level,keyWord);
        Pager pager = new Pager(total, rowPerPage, currentPage);
        pager.setUrl("/Product?action=queryProductList&level="+level+"&category="+(EmptyUtils.isEmpty(category)?"":category));
        List<ProductCategoryVo> productCategoryVoList = productCategoryService.queryAllProductCategoryList();
        List<Product> productList = productService.getProductsByCategory(EmptyUtils.isEmpty(category)?0:Integer.parseInt(category),level,pager,keyWord);
        request.setAttribute("productList", productList);
        request.setAttribute("pager", pager);
        request.setAttribute("total", total);
        request.setAttribute("keyWord", keyWord);
        request.setAttribute("productCategoryVoList", productCategoryVoList);
        return "/pre/product/queryProductList";
    }
    

    
    /**
    *
    * @param request
    * @param response
    * @return
    */
   public String queryProductDeatil(HttpServletRequest request, HttpServletResponse response) throws Exception{
       String id = request.getParameter("id");
       Product product = productService.findById(id);
       List<ProductCategoryVo> productCategoryVoList = productCategoryService.queryAllProductCategoryList();
       request.setAttribute("product", product);
       request.setAttribute("productCategoryVoList", productCategoryVoList);
       addRecentProduct(request,product);
       return "/pre/product/productDeatil";
   }
   /**
    * 查询最近商品
    * @return
    */
   private List<Product> queryRecentProducts(HttpServletRequest request)throws Exception{
       HttpSession session=request.getSession();
       List<Product> recentProducts= (List<Product>) session.getAttribute("recentProducts");
       if(EmptyUtils.isEmpty(recentProducts)){
           recentProducts=new ArrayList<Product>();
       }
       return recentProducts;
   }
   /**
    * 添加最近浏览商品
    * @param request
    * @param product
    */
   private void addRecentProduct(HttpServletRequest request,Product product)throws Exception{
       HttpSession session=request.getSession();
       List<Product> recentProducts=queryRecentProducts(request);
       //判断是否满了
       if(recentProducts.size()>0 &&  recentProducts.size()==10){
         recentProducts.remove(0);
       }
       recentProducts.add(recentProducts.size(),product);
       session.setAttribute("recentProducts",recentProducts);
   }
   
   
}
