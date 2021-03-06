package com.skeyedu.mall.dao.order;

import com.skeyedu.mall.utils.EmptyUtils;
import com.skeyedu.mall.utils.ShoppingCart;
import com.skeyedu.mall.utils.ShoppingCartItem;

public class CartServiceImpl implements CartService {
	   
    @Override
    public ShoppingCart modifyShoppingCart(String productId, String quantityStr, ShoppingCart cart) throws Exception {
       Integer quantity = 0;
       if (!EmptyUtils.isEmpty(quantityStr))
            quantity = Integer.parseInt(quantityStr);
        //便利购物车寻找该商品 修改其数量
        for (ShoppingCartItem item : cart.getItems()) {
            if (item.getProduct().getId().toString().equals(productId)) {
                if (quantity == 0 || quantity < 0) {
                    cart.getItems().remove(item);
                    break;
                } else {
                    item.setQuantity(quantity);
                }
            }
        }
        //重新计算金额
        calculate(cart);
        return cart;
    }

    /**
     * 核算购物车的金额
     *
     * @param cart
     * @return
     * @throws Exception
     */
    @Override
    public ShoppingCart calculate(ShoppingCart cart) throws Exception {
        double sum = 0.0;
        for (ShoppingCartItem item : cart.getItems()) {
            sum = sum + item.getQuantity() * item.getProduct().getPrice();
            item.setCost(item.getQuantity() * item.getProduct().getPrice());
        }
        cart.setSum(sum);
        return cart;
    }
}