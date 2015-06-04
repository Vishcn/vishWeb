package com.vishcn.controller.api;

import com.google.common.collect.Maps;
import com.vishcn.controller.api.param.TestParam;
import com.vishcn.dao.test.Bean.TestBean;
import com.vishcn.service.test.ITest;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.LazyDynaBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("test")
    @ResponseBody
    public Object queryDynaBeanTest(TestParam testParam){
        System.out.println("TEST");
        DynaBean db = new LazyDynaBean();
        db.set("t","a");
        db.set("tr","ar");
        db.set("tt","at");
        Map<String , String> mp = Maps.newHashMap();
        mp.put("t", "a");
        mp.put("tr", "ar");
        mp.put("tt", "at");
        TestBeans t = new TestBeans();
        t.setT("a");
        t.setRr("ar");
        t.setTr("at");
        int id = testParam.getId();
        if (id == 1) {
            return db;
        }
        else if (id == 2) {
            return mp;
        }
        else {
            return t;
        }
    }

    public class TestBeans {

        private String t;

        private String tr;

        private String rr;

        public String getT() {
            return t;
        }

        public void setT(String t) {
            this.t = t;
        }

        public String getTr() {
            return tr;
        }

        public void setTr(String tr) {
            this.tr = tr;
        }

        public String getRr() {
            return rr;
        }

        public void setRr(String rr) {
            this.rr = rr;
        }
    }

}
