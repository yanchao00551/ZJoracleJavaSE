<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<script type="text/javascript">
    var contextPath = "${ctx}";
</script>
<div class="top">
    <div class="search">
        <form action="${ctx}/Product?action=queryProductList" method="post">
            <input type="text" value="${keyWord}" name="keyWord" class="s_ipt">
            <input type="submit" value="搜索" class="s_btn">
        </form>
</div>

    <div class="i_car">
        <div class="car_t">
            购物车 [
            <span>
                <c:if test="${sessionScope.cart!=null && sessionScope.cart.items.size()>0}">
                    ${sessionScope.cart.items.size()}
                </c:if>
                <c:if test="${sessionScope.cart==null || sessionScope.cart.items.size()<=0}">
                    空
                </c:if>
            </span>]
        </div>

        <div class="car_bg">
            <!--Begin 购物车未登录 Begin-->
            <c:if test="${sessionScope.loginUser==null}">
                <div class="un_login">还未登录！<a href="${ctx}/Login?action=toLogin" style="color:#ff4e00;">马上登录</a></div>
            </c:if>
            <c:if test="${sessionScope.loginUser!=null}">
                <div class="un_login">我的购物车</div>
            </c:if>
            <!--End 购物车未登录 End-->
            <!--Begin 购物车已登录 Begin-->
            <ul class="cars">
                <c:forEach items="${sessionScope.cart.items}" var="temp">
                    <li>
                        <div class="img"><a href="${ctx}/Product?action=queryProductDeatil&id=${temp.product.id}"><img src="${ctx}/files/${temp.product.fileName}" width="58" height="58" /></a></div>
                        <div class="name"><a href="${ctx}/Product?action=queryProductDeatil&id=${temp.product.id}">${temp.product.name}</a></div>
                        <div class="price"><font color="#ff4e00">￥${temp.product.price}</font> X${temp.quantity}</div>
                    </li>
                </c:forEach>
            </ul>
            <div class="price_sum">共计&nbsp;<font color="#ff4e00">￥</font><span>${sessionScope.cart.sum}</span></div>
            <c:if test="${sessionScope.loginUser==null}">
                <div class="price_a"><a href="${ctx}/Login?action=toLogin">去登录</a></div>
            </c:if>
            <c:if test="${sessionScope.loginUser!=null}">
                <div class="price_a"><a href="${ctx}/Cart?action=toSettlement">去结算</a></div>
            </c:if>
            <!--End 购物车已登录 End-->
        </div>
    </div>
</div>
<!-- 首先判断cart.items这个List集合中是否有商品，所以调用int size()返回列表中的元素数。然后判断是否登录，如果未登录提示登录信息。如果
已登录使用JSTL标签的foreach循环，将购物车的内容显示
 -->
