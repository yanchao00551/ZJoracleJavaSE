package demo.dao;

import java.util.List;

import com.crezyman.utils.Params;

import demo.domain.Person;

public interface IPersonDAO {
	/**
	 * 查找员工详情
	 * @param params
	 * @return
	 */
	public List<Object> selectPersonDetails(Params params);
}
