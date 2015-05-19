package com.vishcn.service.test;

import com.vishcn.common.datasource.DataSource;
import com.vishcn.dao.test.Bean.TestBean;

import java.util.List;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.service.test <br>
 * Description: <br>
 * DATE 15/5/18 18:27 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public interface ITest {


    public int insert(int id, String name);


    @DataSource("read")
    public int insertTest(int id, String name);


    @DataSource("read")
    public List<TestBean> query();

    public List<TestBean> queryTest();
}
