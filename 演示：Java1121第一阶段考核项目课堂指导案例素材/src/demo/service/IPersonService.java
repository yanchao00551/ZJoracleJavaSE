package demo.service;

import java.util.List;

import com.crezyman.utils.Params;

import demo.domain.Person;

/**
 * 框架不满足连表查询，我需要自己扩展连表查，自定义业务逻辑
 * @author 10947
 *
 */
public interface IPersonService {
	
	/**
	 * 后台显示员工列表同时显示员工喜爱的书籍名称（连表）
	 */
	public List<Object> queryPersonAndBookList(Params params);
}
