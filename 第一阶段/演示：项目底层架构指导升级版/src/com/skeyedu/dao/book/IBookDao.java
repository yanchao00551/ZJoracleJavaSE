package com.skeyedu.dao.book;

import java.util.List;

import com.crezyman.utils.Params;

public interface IBookDao {
	
	
	/**
	 * 自定义方法  根据书籍查出出版社信息
	 * @param params
	 * @return
	 */
	List<Object> queryBookLinkPublisherTable(Params params);
}
