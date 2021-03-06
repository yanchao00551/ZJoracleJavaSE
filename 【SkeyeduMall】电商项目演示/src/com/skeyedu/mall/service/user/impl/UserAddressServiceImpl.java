package com.skeyedu.mall.service.user.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.skeyedu.mall.dao.order.UserAddressDao;
import com.skeyedu.mall.dao.order.UserAddressDaoImpl;
import com.skeyedu.mall.entity.UserAddress;
import com.skeyedu.mall.param.UserAddressParam;
import com.skeyedu.mall.service.user.UserAddressService;
import com.skeyedu.mall.utils.DataSourceUtil;

public class UserAddressServiceImpl implements UserAddressService {

	  /**
     * 查询用户地址列表
     *
     * @param id
     * @return
     * @throws Exception
     */
    public List<UserAddress> queryUserAdressList(Integer id) throws Exception{
        Connection connection = null;
        List<UserAddress> userAddressList = null;
        try {
            connection = DataSourceUtil.openConnection();
            UserAddressDao userAddressDao = new UserAddressDaoImpl(connection);
            UserAddressParam params = new UserAddressParam();
            params.setUserId(id);
            userAddressList = userAddressDao.queryUserAddressList(params);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	DataSourceUtil.closeConnection(connection);
        }
        return userAddressList;
    }
    /**
     * 添加用户地址
     *
     * @param id
     * @param address
     * @return
     */
    @Override
    public Integer addUserAddress(Integer id, String address,String remark) {
        Connection connection = null;
        Integer userAddressId = null;
        try {
            connection = DataSourceUtil.openConnection();
            UserAddressDao userAddressDao = new UserAddressDaoImpl(connection);
            UserAddress userAddress=new UserAddress();
            userAddress.setUserId(id);
            userAddress.setAddress(address);
            userAddress.setRemark(remark);
            userAddressId = userAddressDao.saveUserAddress(userAddress);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	DataSourceUtil.closeConnection(connection);
        }
        return userAddressId;
    }

    @Override
    public UserAddress getUserAddressById(Integer id) {
        Connection connection = null;
        UserAddress userAddress= null;
        try {
            connection = DataSourceUtil.openConnection();
            UserAddressDao userAddressDao = new UserAddressDaoImpl(connection);
            userAddress = (UserAddress) userAddressDao.getUserAddressById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DataSourceUtil.closeConnection(connection);
            return  userAddress;
        }
    }

}
