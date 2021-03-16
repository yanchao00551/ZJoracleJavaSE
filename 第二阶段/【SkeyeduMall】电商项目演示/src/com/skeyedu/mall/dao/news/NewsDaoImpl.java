package com.skeyedu.mall.dao.news;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.skeyedu.mall.dao.BaseDaoImpl;
import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.param.NewsParams;
import com.skeyedu.mall.utils.EmptyUtils;

public class NewsDaoImpl extends BaseDaoImpl implements NewsDao {



	public NewsDaoImpl(Connection connection) {
		// TODO Auto-generated constructor stub
		super(connection);
	}

	@Override
	public void save(News news) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO skeyedu_news(title,content,createTime) values(?,?,?)";
		Object[] params = new Object[] {news.getTitle(),news.getContent(),new Date()};
		this.excuteUpdate(sql, params);
	}

	@Override
	public void update(News news) throws Exception {
		// TODO Auto-generated method stub
		String sql = "UPDATE skeyedu_news SET title=?,content=? WHERE id=?";
		Object[] params = new Object[] {news.getTitle(),news.getContent(),news.getId()};
		this.excuteUpdate(sql, params);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM skeyedu_news WHERE id= ?";
		Object[] params = new Object[] {id};
		this.excuteUpdate(sql, params);
	}

	@Override
	public News getNewsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM skeyedu_news WHERE id = ?";
		ResultSet resultSet = null;
		News news = null;
		try {
			Object params[] = new Object[] {id};
			resultSet = this.executeQuery(sql, params);
			while(resultSet.next()) {
				news = (News) tableToClass(resultSet);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource(resultSet);
			this.closeResource();
			return news;
		}
	}
	
	

	@Override
	public List<News> queryNewsList(NewsParams params) throws Exception {
		// TODO Auto-generated method stub
		List<Object> paramsList = new ArrayList<Object>();
		List<News> newsList = new ArrayList<News>();
		StringBuffer sql = new StringBuffer("SELECT id,title,content,createTime  FROM skeyedu_news WHERE 1=1 ");
		if(EmptyUtils.isNotEmpty(params.getTitle())){
			sql.append(" AND title like ?");
			paramsList.add(params.getTitle());
		}
		if(EmptyUtils.isNotEmpty(params.getSort())) {
			sql.append(" ORDER BY " + params.getSort() + " ");
		}
		
		if(params.isPage()) {
			sql.append(" LIMIT " + params.getStartIndex() + ", " + params.getPageSize());
		}
		
		ResultSet resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
		
		try {
			while(resultSet.next()) {
				News news = (News) this.tableToClass(resultSet);
				newsList.add(news);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource(resultSet);
			this.closeResource();
		}
		
		return newsList;
	}
	
	

	@Override
	public Integer queryNewsCount(NewsParams params) throws Exception {
		// TODO Auto-generated method stub
		
		List<Object> paramsList = new ArrayList<Object>();
		Integer count = 0;
		StringBuffer sql = new StringBuffer("SELECT count(1) AS count FROM skeyedu_news WHERE 1=1 ");
		if(EmptyUtils.isNotEmpty(params.getTitle())){
			sql.append(" AND title like ?");
			paramsList.add(params.getTitle());
		}
		if(EmptyUtils.isNotEmpty(params.getSort())) {
			sql.append(" ORDER BY " + params.getSort() + " ");
		}
		

		
		ResultSet resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
		
		try {
			while(resultSet.next()) {
				count = resultSet.getInt("count");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource(resultSet);
			this.closeResource();
		}
		
		return count;
	}

	@Override
	public Object tableToClass(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		News news = new News();
		news.setId(rs.getInt("id"));
		news.setTitle(rs.getString("title"));
		news.setContent(rs.getString("content"));
		news.setCreateTime(rs.getDate("createTime"));
		return news;
	}

}
