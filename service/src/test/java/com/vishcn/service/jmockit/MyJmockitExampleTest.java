package com.vishcn.service.jmockit;

import com.beust.jcommander.internal.Lists;
import com.vishcn.dao.test.Bean.TestBean;
import com.vishcn.service.test.ITest;
import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.Verifications;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.service.jmockit <br>
 * Description: <br>
 * DATE 15/6/4 14:55 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public class MyJmockitExampleTest {

    @Tested
    private MyJmockitExample myJmockitExample;

    @Injectable
    private ITest testImpl;

    @Test
    public void checkAuth() throws Exception {

        final List<TestBean> list = Lists.newArrayList();
        TestBean testBean = new TestBean();
        list.add(testBean);
        new NonStrictExpectations(){{
             testImpl.query(); result = list;
        }} ;

        boolean result = myJmockitExample.checkAuth("userGuid", 1);

        new Verifications() {//验证预期Mock行为被调用
            {
                //验证这个方法是否被调用
                testImpl.query();
                times = 1;
            }
        };

        Assert.assertEquals(true, result);
    }
}
