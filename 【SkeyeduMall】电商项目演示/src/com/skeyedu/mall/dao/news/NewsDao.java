package com.skeyedu.mall.dao.news;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.param.NewsParams;

/**
 *      新闻的dao
 * @author 10947
 *
 */
public interface NewsDao extends IBaseDao{
	public void save(News news) throws Exception;
	
	public void update(News news) throws Exception;
	
	public void deleteById(Integer id) throws Exception;
	
	public News getNewsById(Integer id) throws Exception;
	
	public List<News> queryNewsList(NewsParams params) throws Exception;
	
	public Integer queryNewsCount(NewsParams params) throws Exception;
}
