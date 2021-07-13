package demo.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.crezyman.service.CrezyManService;
import com.crezyman.utils.DataSourceUtil;
import com.crezyman.utils.Params;

import demo.dao.IPersonDAO;
import demo.dao.MenuDAO;
import demo.dao.PersonDAO;
import demo.domain.Menu;
import demo.domain.Person;

/**
 * ÒµÎñÂß¼­
 * @author 10947
 *
 */
public class PersonService extends CrezyManService<Person,PersonDAO> implements IPersonService{

	@Override
	public List<Object> queryPersonAndBookList(Params params) {
		// TODO Auto-generated method stub
		
		try {
			List<Object> list=new ArrayList<Object>();
			Connection connection = null;
			try {
				connection = DataSourceUtil.openConnection();
				IPersonDAO dao = (IPersonDAO) super.getActualTypeArgumentIns(connection);
				list=dao.selectPersonDetails(params);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
			return list;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
