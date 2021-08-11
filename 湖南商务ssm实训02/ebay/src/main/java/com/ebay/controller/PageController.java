package com.ebay.controller;

import com.ebay.core.bean.DeptEntity;
import com.ebay.service.DeptService;
import com.ebay.vo.DeptConditionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 显示页面
 * @author 悟空
 */
@Controller
public class PageController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = {"/register"},method = RequestMethod.GET)
    public String register(@ModelAttribute DeptConditionVO vo, Model model){
        List<DeptEntity> list = deptService.queryFindPageAllData(vo);
        model.addAttribute("deptList",list);
        return "reg";
    }
}
