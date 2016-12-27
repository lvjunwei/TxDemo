package com.lv;

import com.lv.domain.Emp;
import com.lv.service.EmpService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;


/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{

    public void testApp()
    {

        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmpService empService = (EmpService) act.getBean("empServiceImpl");
        empService.TiaoZhengSal(new Emp(1234,new BigDecimal(1000)),new Emp(1235,new BigDecimal(900)));
    }
}
