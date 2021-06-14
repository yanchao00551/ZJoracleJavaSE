package com.skeyedu.service;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.dao.book.BookDaoImpl;
import com.skeyedu.dao.book.IBookDao;
import com.skeyedu.entity.BookEntity;
import com.crezyman.service.CrezyManService;
import com.crezyman.utils.DataSourceUtil;
import com.crezyman.utils.Params;

/*
 * 学习模块基础业务逻辑类
 */


/**
 * 
 * @author 10947
 *
 */
public class BookService extends CrezyManService<BookEntity,BookDaoImpl> implements IBookService{

	@Override
	public List<Object> queryBookLinkPublisherByList(Params params) {
		// TODO Auto-generated method stub
		List<Object> list=new ArrayList<Object>();
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			IBookDao dao = (IBookDao) super.getActualTypeArgumentIns(connection);
			list=dao.queryBookLinkPublisherTable(params);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return list;
	}
	
}
