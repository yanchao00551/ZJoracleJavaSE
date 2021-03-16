package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class User{
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + "]";
	}
	
	
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(1);
		List<User> list = new ArrayList<>();
		list.add(user);
		
		Map<String,Object> map = new HashMap<>();
		map.put("list", list);
		map.put("count", "hello");
		
		
		//怎么读？？
		Set<Entry<String, Object>> set = map.entrySet();
		Iterator<Entry<String,Object>> itr = set.iterator();
		List<User> list2 = new ArrayList<>();
		Object listUser = null;
		String count = null;
		while(itr.hasNext()) {
			Entry<String,Object> entry = itr.next();
			if(entry.getKey().equals("list")) {
				listUser = entry.getValue();
			}else {
				count = (String)entry.getValue();
			}
		}
		
		if(listUser instanceof ArrayList<?>) {
			for(Object o:(List<?>)listUser) {
				list2.add(User.class.cast(o));
			}
		}
		
		for(User l:list2) {
			System.out.println(l);
		}
		System.out.println(count);
	}

}
