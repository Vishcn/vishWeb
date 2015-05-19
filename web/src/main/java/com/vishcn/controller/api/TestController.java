package com.vishcn.controller.api;

import com.vishcn.controller.api.param.TestParam;
import com.vishcn.dao.test.Bean.TestBean;
import com.vishcn.service.test.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p/>
 * Project: javawebTemplate <br>
 * Package com.vishcn.controller.api <br>
 * Description: <br>
 * DATE 15/5/14 18:58 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITest testImpl;


    @RequestMapping("insert")
    @ResponseBody
    public int test(TestParam testParam){
        System.out.println("TEST");
         return testImpl.insert(testParam.getId(),testParam.getName());
    }

    @RequestMapping("insertTest")
    @ResponseBody
    public int inserttest(TestParam testParam){
        System.out.println("TEST");
         return testImpl.insertTest(testParam.getId(), testParam.getName());
    }

    @RequestMapping("query")
    @ResponseBody
    public List<TestBean> query(TestParam testParam){
        System.out.println("TEST");
        return testImpl.query();
    }

    @RequestMapping("queryTest")
    @ResponseBody
    public List<TestBean> queryTest(TestParam testParam){
        System.out.println("TEST");
        return testImpl.queryTest();
    }
}
