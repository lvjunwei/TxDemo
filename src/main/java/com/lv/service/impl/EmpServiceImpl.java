package com.lv.service.impl;

import com.lv.dao.EmpDao;
import com.lv.domain.Emp;
import com.lv.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/5.
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }

    public void TiaoZhengSal(Emp emp1, Emp emp2) {
        empDao.updateByPrimaryKeySelective(emp1);
//        System.out.println(3 / 0);
        empDao.updateByPrimaryKeySelective(emp2);
    }
}
