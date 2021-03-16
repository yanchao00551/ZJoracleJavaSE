package com.skeyedu.mall.dao.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.mall.dao.BaseDaoImpl;
import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.param.UserParam;
import com.skeyedu.mall.utils.EmptyUtils;

/**
 * 用户dao
 */
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

    public UserDaoImpl(Connection connection) {
        super(connection);
    }

    @Override
    public User tableToClass(ResultSet rs) throws Exception {
        User user = new User();
        user.setLoginName(rs.getString("loginName"));
        user.setUserName(rs.getString("userName"));
        user.setPassword(rs.getString("password"));
        user.setSex(rs.getInt("sex"));
        user.setIdentityCode(rs.getString("identityCode"));
        user.setEmail(rs.getString("email"));
        user.setMobile(rs.getString("mobile"));
        user.setType(rs.getInt("type"));
        user.setId(rs.getInt("id"));
        return user;
    }
    /**
     * 根据id查询用户
     *
     * @param loginName
     * @return
     * @throws SQLException
     */
    public User findByLoginName(String loginName) {//根据ID查询用户信息
        User user = null;
        try {
        	UserParam param = new UserParam();
        	param.setLoginName(loginName);
            List<User> userList = queryUserList(param);
            if (EmptyUtils.isEmpty(userList)) {
                return null;
            } else {
                return userList.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	this.closeResource();
        }
        return user;
    }

    /**
     * 保存用户
     *
     * @param user
     * @throws SQLException
     */
    public int save(User user){//新增用户信息
    	Integer id=0;
    	try {
    		String sql=" INSERT into skeyedu_user(loginName,userName,password,sex,identityCode,email,mobile) values(?,?,?,?,?,?,?) ";
            try {
                Object param[]=new Object[]{user.getLoginName(),user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile()};
                id=this.executeInsert(sql,param);
                user.setId(id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	this.closeResource();
        }
    	return id;
    }

    //更新用户信息
    public void update(User user) {
    	try {
        	Object[] params = new Object[] {user.getUserName(),user.getType(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile(),user.getId()};
        	String sql = " UPDATE skeyedu_user SET userName =?,type=?,sex =?, identityCode =?, email =?, mobile =? WHERE id =?  ";
    		this.excuteUpdate(sql, params);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	this.closeResource();
        }
    }

	@Override
	public void deleteById(String id) {
		String sql = " delete from skeyedu_user where id = ? ";
		Object params[] = new Object[] { id };
		try{
			this.excuteUpdate(sql.toString(), params);
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
        	this.closeResource();
        }
	}

	@Override
	public List<User> queryUserList(UserParam params) throws Exception {
		List<Object> paramsList=new ArrayList<Object>();   
		List<User> userList=new ArrayList<User>();
		StringBuffer sql=new StringBuffer("  select id,loginName,password,userName,sex,identityCode,email,mobile,type from skeyedu_user where 1=1 ");
		ResultSet resultSet = null;
		try {
			if(EmptyUtils.isNotEmpty(params.getLoginName())){
				sql.append(" and loginName = ? ");
				paramsList.add(params.getLoginName());
			}
			if(EmptyUtils.isNotEmpty(params.getSort())){
				sql.append(" order by " + params.getSort()+" ");
			}
			if(params.isPage()){
				sql.append(" limit  " + params.getStartIndex() + "," + params.getPageSize());
			}
			resultSet=this.executeQuery(sql.toString(),paramsList.toArray());
			while (resultSet.next()) {
				User user = this.tableToClass(resultSet);
				userList.add(user);
			}
		}  catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.closeResource();
			this.closeResource(resultSet);
		}
		return userList;
	}
	
	public Integer queryUserCount(UserParam params) throws Exception {
		List<Object> paramsList=new ArrayList<Object>();   
		StringBuffer sql=new StringBuffer(" select count(*) count from skeyedu_user where 1=1 ");
		Integer count=0;
		if(EmptyUtils.isNotEmpty(params.getLoginName())){
			sql.append(" and loginName = ? ");
			paramsList.add(params.getLoginName());
		}
		ResultSet resultSet = this.executeQuery(sql.toString(),paramsList.toArray());
		try {
			while (resultSet.next()) {
				count=resultSet.getInt("count");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.closeResource();
			this.closeResource(resultSet);
		}
		return count;
	}
	
	
	@Override
	public User queryUserById(Integer id) throws Exception {
		List<Object> paramsList=new ArrayList<Object>();   
		List<User> userList=new ArrayList<User>();
		StringBuffer sql=new StringBuffer("  select id,loginName,userName,password,sex,identityCode,email,mobile,type from skeyedu_user where id=? ");
		ResultSet resultSet = this.executeQuery(sql.toString(),new Object[]{id});
		User user=null;
		try {
			while (resultSet.next()) {
				user = this.tableToClass(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.closeResource();
			this.closeResource(resultSet);
		}
		return user;
	}

}

