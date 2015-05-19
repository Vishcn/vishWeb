package com.vishcn.common.datasource;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;


/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.common.com.vishcn.common.datasourc <br>
 * Description: <br>
 * DATE 15/5/18 16:16 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public class DataSourceAspect {


    public void pointCut() {
    }

    ;

    public void before(JoinPoint point) {
        Object traget = point.getTarget();
        String method = point.getSignature().getName();
        Class<?> clazz = traget.getClass();
        Thread t = Thread.currentThread();
        String a = HandleDataSource.getDataSource();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
        try {
            Method m = clazz.getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                HandleDataSource.setDataSource(data.value());
                return;
            }
            Class<?>[] clazzs = clazz.getInterfaces();
            Method mI = clazzs[0].getMethod(method, parameterTypes);
            if (mI != null && mI.isAnnotationPresent(DataSource.class)) {
                DataSource data = mI.getAnnotation(DataSource.class);
                HandleDataSource.setDataSource(data.value());
                return;
            }
            HandleDataSource.setDataSource(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
