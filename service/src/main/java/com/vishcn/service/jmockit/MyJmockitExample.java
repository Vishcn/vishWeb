package com.vishcn.service.jmockit;

import com.vishcn.dao.test.Bean.TestBean;
import com.vishcn.service.test.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.service.jmockit <br>
 * Description: <br>
 * DATE 15/6/4 14:47 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
@Service
public class MyJmockitExample {

    @Autowired
    private ITest testImpl;



    public boolean checkAuth(String userGuid, Integer id) {

        doSomething();

        List<TestBean> list = testImpl.query();
        if (list == null || list.size() == 0) {
            return false;
        }
       return true;
    }

    public void doSomething() {

    }


}
