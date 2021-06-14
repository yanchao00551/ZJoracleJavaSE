package demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.crezyman.utils.Params;

import demo.domain.Person;
import demo.service.PersonService;

/**
 * @author 10947
 *
 */
public class ConnectJDBC {
	public void test() {
		// TODO Auto-generated method stub
		PersonService personService = new PersonService();
		Params params = new Params();
		
		Map<String,Object> sortParams = new HashMap<>();
		sortParams.put("birthday desc", null);
		params.setSortParams(sortParams);
		List<Object> list = personService.queryOrdersList(params);
		for(Object l: list) {
			System.out.println((Person)l);
		}
	}
}
