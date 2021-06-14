<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>LayUI DataGrid</title>

<link rel="stylesheet" href="<%=path%>/static/layui/css/layui.css">

<script src="<%=path%>/static/layui/layui.js"></script>
</head>
<body>

<table id="demo" lay-filter="test"></table>


<script>
layui.use('table', function(){
  var table = layui.table;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: '<%=basePath%>HomeServlet' //数据接口
  	,parseData: function(res){ //res 即为原始返回的数据
      return {
  		      "code": res.status, //解析接口状态
  		      "msg": res.message, //解析提示文本
  		      "count": res.total, //解析数据长度
  		      "data": res.data    //解析数据列表
  	  };
    }
    ,page: true //开启分页
    ,cols: [[ //表头
      {field: 'uname', title: '用户名', width:250,  fixed: 'left'}
      ,{field: 'upwd', title: '密码', width:250}
    ]]
  });
});

</script>

</body>
</html>