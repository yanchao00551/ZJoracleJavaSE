package com.skeyedu.mall.dao.order;

import com.skeyedu.mall.utils.ShoppingCart;

public interface CartService {
    public ShoppingCart modifyShoppingCart(String productId,String quantityStr,ShoppingCart cart) throws Exception;
    public ShoppingCart calculate(ShoppingCart cart)throws Exception;
}