package com.skeyedu.dao;

import java.util.List;

import com.skeyedu.utils.Params;



public interface IBaseDao {
    /**
     * 每一个dao都需要重写的tableName
     * @return
     */
    public String getTableName();
//	
//	/**
//	 * 查询单表的数目
//	 * @param  params
//	 * @return 
//	 * @throws Exception
//	 */
//    public int getRowCount(Params params) throws Exception;
//    /**
//     * 查询单表的列表
//     * @param params
//     * @return
//     * @throws Exception
//     */
//    public List getRowList(Params params)throws Exception;


//    /**
//     * 根据参数更新对象
//     * @param params
//     * @throws Exception
//     */
//    public void updateByQuery(Params params) throws Exception;
//    /**
//     * 根据参数添加对象
//     * @param params
//     * @return
//     * @throws Exception
//     */
//    public Integer addObject(Params params)throws Exception;

//    /**
//     * 自定义sql的方法
//     * @param sql
//     * @param params
//     */
//    public List selectBySql(String sqlStr,Params query)throws Exception;


}
