package demo.service;

import java.util.List;

import com.crezyman.utils.Params;

import demo.domain.Person;

/**
 * ��ܲ����������ѯ������Ҫ�Լ���չ����飬�Զ���ҵ���߼�
 * @author 10947
 *
 */
public interface IPersonService {
	
	/**
	 * ��̨��ʾԱ���б�ͬʱ��ʾԱ��ϲ�����鼮���ƣ�����
	 */
	public List<Object> queryPersonAndBookList(Params params);
}
