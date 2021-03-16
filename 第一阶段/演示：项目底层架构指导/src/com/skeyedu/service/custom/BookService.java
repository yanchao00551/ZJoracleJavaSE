package com.skeyedu.service.custom;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.dao.ModelDao;
import com.skeyedu.dao.book.BookDaoImpl;
import com.skeyedu.dao.book.IBookDao;
import com.skeyedu.dao.student.StudentDaoImpl;
import com.skeyedu.entity.book.BookEntity;
import com.skeyedu.entity.student.StudentEntity;
import com.skeyedu.service.AbstractBaseService;
import com.skeyedu.utils.DataSourceUtil;
import com.skeyedu.utils.Params;

/*
 * 学习模块基础业务逻辑类
 */


/**
 * 
 * @author 10947
 *
 */
public class BookService extends AbstractBaseService<BookEntity,BookDaoImpl> implements IBookService{

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
