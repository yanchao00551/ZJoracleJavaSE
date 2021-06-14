package com.skeyedu.mall.service.news.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.mall.dao.news.NewsDao;
import com.skeyedu.mall.dao.news.NewsDaoImpl;
import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.param.NewsParams;
import com.skeyedu.mall.service.news.NewsService;
import com.skeyedu.mall.utils.DataSourceUtil;
import com.skeyedu.mall.utils.Pager;

public class NewsServiceImpl implements NewsService{

	@Override
	public void saveNews(News news) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			newsDao.save(news);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}
	
	

	@Override
	public News findNewsById(String id) {
		// TODO Auto-generated method stub
		News news = null;
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			news = newsDao.getNewsById(Integer.parseInt(id));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return news;
	}

	@Override
	public List<News> getAllNews(Pager pager) {
		// TODO Auto-generated method stub
		List<News> rtn = new ArrayList<News>();
		
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			
			NewsParams params = new NewsParams();
			params.openPage((pager.getCurrentPage() - 1) * pager.getRowPerPage(), pager.getRowPerPage());
			rtn = newsDao.queryNewsList(params);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return rtn;
	}

	@Override
	public void deleteNews(String id) {  //删除新闻
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			newsDao.deleteById(Integer.parseInt(id));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}

	@Override
	public List<News> queryNewsList(NewsParams param) {
		// TODO Auto-generated method stub
        List<News> newsList = new ArrayList<News>();
		
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			newsList = newsDao.queryNewsList(param);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return newsList;
	}
	

	@Override
	public Integer queryNewsCount(NewsParams param) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		Integer count = 0;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			count = newsDao.queryNewsCount(param);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return count;
	}



	@Override
	public void updateNews(News news) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			NewsDao newsDao = new NewsDaoImpl(connection);
			newsDao.update(news);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}

}
