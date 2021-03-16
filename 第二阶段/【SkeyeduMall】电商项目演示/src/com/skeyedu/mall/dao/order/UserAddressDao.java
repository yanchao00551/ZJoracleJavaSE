package com.skeyedu.mall.dao.order;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.UserAddress;
import com.skeyedu.mall.param.UserAddressParam;

public interface UserAddressDao extends IBaseDao {
	
	public List<UserAddress> queryUserAddressList(UserAddressParam param);
	
	public Integer saveUserAddress(UserAddress userAddress);
	
	public UserAddress getUserAddressById(Integer addressId);

}