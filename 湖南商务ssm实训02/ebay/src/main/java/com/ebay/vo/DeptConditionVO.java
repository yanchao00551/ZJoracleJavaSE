package com.ebay.vo;

import com.ebay.core.object.BaseConditionVO;
import com.ebay.entity.Dept;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @PackageName:com.ebay.vo
 * @ClassName:DeptConditionVO
 * @Description:
 * @author: 悟空
 * @date: 2021/6/26 9:51
 * @email: 10947@163.com
 */
@Data
public class DeptConditionVO extends BaseConditionVO {
    private Dept dept;
    private List<Long> ids;

    public DeptConditionVO(){
        this.dept = new Dept();
    }
}
