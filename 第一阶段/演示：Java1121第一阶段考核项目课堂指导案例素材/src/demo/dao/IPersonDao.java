package demo.dao;

import java.util.List;

import com.crezyman.utils.Params;

import demo.domain.Person;

public interface IPersonDAO {
	/**
	 * ����Ա������
	 * @param params
	 * @return
	 */
	public List<Object> selectPersonDetails(Params params);
}
