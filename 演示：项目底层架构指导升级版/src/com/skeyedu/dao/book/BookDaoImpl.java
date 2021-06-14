package com.skeyedu.dao.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;
import com.crezyman.utils.Params;
import com.skeyedu.entity.BookEntity;

@Table(name = "book")
public class BookDaoImpl extends CrezyManDao implements IBookDao{
	public BookDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Object> queryBookLinkPublisherTable(Params params) {
		// TODO Auto-generated method stub
		List<Object> paramsList = new ArrayList<Object>();
		List<Object> list = new ArrayList<Object>();
		StringBuffer sql = new StringBuffer("SELECT * FROM book LEFT JOIN publisher ON book.p_id = publisher.p_id WHERE 1=1 ");

		Map<String, Object> make = super.getParamsList(params);
		sql.append(make.get("sql"));

		Object obj = make.get("paramsList");
		if (obj instanceof ArrayList<?>) {
			for (Object o : (List<?>) obj) {
				paramsList.add(Object.class.cast(o));
			}
		}

		ResultSet resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
		try {
			while (resultSet.next()) {
				BookEntity bookEntity  = new BookEntity();
				bookEntity.setbId(resultSet.getInt("b_id"));
				bookEntity.setbName(resultSet.getString("b_name"));
				bookEntity.setpId(resultSet.getInt("p_id"));
				bookEntity.setbAuthor(resultSet.getString("b_author"));
				bookEntity.setbPrice(resultSet.getDouble("b_price"));
				bookEntity.setpName(resultSet.getString("p_name"));
				bookEntity.setpLinkman(resultSet.getString("p_linkman"));
			    bookEntity.setpTel(resultSet.getString("p_address"));
				list.add(bookEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
			this.closeResource(resultSet);
		}

		return list;
	}
}
