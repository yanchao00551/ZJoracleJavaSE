package com.skeyedu.mall.service.news;

import java.util.List;

import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.param.NewsParams;
import com.skeyedu.mall.utils.Pager;

public interface NewsService {
	
	/**
	 *      保存新闻
	 * @param news
	 */
	void saveNews(News news);   //保存新闻
	
	
	/**
	 *   根 据id查询新闻
	 * @param parameter
	 * @return
	 */
	News findNewsById(String parameter);
	
	
	/**
	  *    查询所有新闻
	 * @param pager
	 * @return
	 */
	List<News> getAllNews(Pager pager);
	
	
	/**
	   *  删除新闻
	 * @param parameter
	 */
	void deleteNews(String parameter);
	
	
	/**
	 * 查询新闻列表
	 * @param param
	 * @return
	 */
	List<News> queryNewsList(NewsParams param);
	
	
	/**
   	   * 查询新闻数目
	 * @param param
	 * @return
	 */
	Integer queryNewsCount(NewsParams param);
	
	
	/**
	 * 更新新闻
	 * @param news
	 */
	void updateNews(News news);
	
}
