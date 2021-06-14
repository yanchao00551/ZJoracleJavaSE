<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.util.*" %> 
<%@ page import="java.util.Map.*" %>        
<%@ page import="org.news.entity.NewsUser" %>
<%@ page import="org.news.dao.NewUserDao" %>
<%@ page import="org.news.dao.impl.NewUserDaoImpl" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>jsp分页</title>
</head>
<body>

<table border="1" spacing="2">

<%
  NewUserDao newUserDao = new NewUserDaoImpl();
  int pagesize = 5;
  int pageCount;
  
  String tmp = request.getParameter("curPage").trim();
  int curPage;
  if(tmp == null){
	  curPage = 1;
  }
  curPage = Integer.parseInt(tmp);
  
  int size = 0;
  
  int limit = (curPage - 1) * pagesize;
  
  Map<String,Object> map = newUserDao.queryPage(limit, pagesize);
  
  Set<Entry<String, Object>> setResult = map.entrySet();
  Iterator<Entry<String,Object>> itr = setResult.iterator();
  List<NewsUser> list = new ArrayList<>();
  Object list2 = null;
  while(itr.hasNext()){
	    Entry<String,Object> entry = itr.next();
	    if(entry.getKey().equals("list")){
	    	list2 = entry.getValue();
	    }
	    if(entry.getKey().equals("count")){
	    	size = Integer.parseInt((String)entry.getValue());
	    }
  }
  
  
  if(list2 instanceof ArrayList<?>) {
		for(Object o:(List<?>)list2) {
			list.add(NewsUser.class.cast(o));
		}
  }
	
  
  
  pageCount = (size%pagesize == 0) ? (size/pagesize) : (size/pagesize +1);
  
  out.print("当前页：" + curPage);
  
  for(NewsUser l:list){
  %>
	  <tr>
	  <td><%= l.getUname() %></td>
	  <td><%= l.getUpwd() %></td>
	  </tr>
 <% 
  }
 %>-
  
<a href="page.jsp?curPage=1">首页</a>
<a href="page.jsp?curPage=<%=curPage-1 %>">上一页</a>
<a href="page.jsp?curPage=<%=curPage+1 %>">下一页</a>
<a href="page.jsp?curPage=<%= pageCount %>">尾页</a>

第<%=curPage %> 页/共  <%=pageCount %>页

</table>




</body>
</html>