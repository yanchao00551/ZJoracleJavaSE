package demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDAO;
import com.crezyman.utils.Params;
import demo.domain.Person;

@Table(name = "person")
public class PersonDAO extends CrezyManDAO implements IPersonDAO{

	public PersonDAO(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ‘§±‡“Î∂‘œÛ  –¥ SQL
	 */
	@Override
	public List<Object> selectPersonDetails(Params params) {
		// TODO Auto-generated method stub
		List<Object> paramsList = new ArrayList<Object>();
		List<Object> list = new ArrayList<Object>();
		StringBuffer sql = new StringBuffer("SELECT * FROM person LEFT JOIN book ON book.b_id = person.like_bid WHERE 1=1 ");

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
				Person person  = new Person();
				person.setAge(resultSet.getInt("age"));
				person.setbAuthor(resultSet.getString("b_author"));
				person.setBirthday(resultSet.getDate("birthday"));
				person.setName(resultSet.getString("name"));
				person.setbPrice(resultSet.getDouble("b_price"));
				person.setLikeBid(resultSet.getInt("like_bid"));
				person.setSalary(resultSet.getBigDecimal("salary"));
				person.setPid(resultSet.getInt("pid"));
				person.setbName(resultSet.getString("b_name"));
				list.add(person);
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
