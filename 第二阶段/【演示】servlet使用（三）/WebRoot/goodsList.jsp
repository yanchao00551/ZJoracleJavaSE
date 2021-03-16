<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品列表页</title>
</head>
<body>

<div style="width:600px">


<table border="1" width="80%">

<tr>
   <th>序号</th>
   <th>商品名称</th>
   <th>产地</th>
   <th>价格</th>
</tr>



<!-- 循环输出商品信息 -->
<c:forEach var="product" items="${requestScope.goodsList }" varStatus="status">
<!-- 如果是偶数行，为该行换背景颜色 -->
<tr <c:if test="${status.index % 2 == 1}"> style="background-color:rgb(219,241,212);" </c:if>>
    <td>
    ${status.index +1}
    </td>
    <!-- 商品名称 -->
    <td>
        ${product.name}
    </td>
    <!-- 产地 -->
    <td>
        ${product.area}
    </td>
    <!-- 价格 -->
    <td>
        ${product.price}
    </td>
</tr>





</c:forEach>



</table>


</div>



</body>
</html>