package com.vishcn.dao.test;

import com.vishcn.dao.test.Bean.TestBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.dao.test <br>
 * Description: <br>
 * DATE 15/5/18 18:23 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public interface TestMapper {

    public List<TestBean> queryTest();

    public int insertTest(@Param("id") int id,@Param("name") String name);


}
