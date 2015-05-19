package com.vishcn.service.test.impl;

import com.vishcn.common.datasource.DataSource;
import com.vishcn.dao.test.Bean.TestBean;
import com.vishcn.dao.test.TestMapper;
import com.vishcn.service.test.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.service.test.impl <br>
 * Description: <br>
 * DATE 15/5/18 18:28 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
@Service
public class TestImpl implements ITest{

    @Autowired
    private TestMapper testMapper;


    @DataSource("read")
    public int insert(int id, String name){
         return testMapper.insertTest(id , name);
    }

    @DataSource
    public int insertTest(int id, String name){
         return testMapper.insertTest(id , name);
    }

    public List<TestBean> query(){
        return testMapper.queryTest();
    }

    public List<TestBean> queryTest(){
        return testMapper.queryTest();
    }
}
