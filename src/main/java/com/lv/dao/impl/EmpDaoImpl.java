package com.lv.dao.impl;

import com.lv.dao.EmpDao;
import com.lv.domain.Emp;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/5.
 */
@Repository
public class EmpDaoImpl implements EmpDao {

    @Autowired
    private SqlSessionFactory sessionFactory;

    public void setSessionFactory(SqlSessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int deleteByPrimaryKey(Integer empno) {
        EmpDao mapper = sessionFactory.openSession().getMapper(EmpDao.class);
        return mapper.deleteByPrimaryKey(empno);
    }

    public int insert(Emp record) {
        return 0;
    }

    public int insertSelective(Emp record) {
        return 0;
    }

    public Emp selectByPrimaryKey(Integer empno) {
        return null;
    }

    public int updateByPrimaryKeySelective(Emp record) {
        EmpDao mapper = sessionFactory.openSession().getMapper(EmpDao.class);
        return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Emp record) {
        return 0;
    }
}
