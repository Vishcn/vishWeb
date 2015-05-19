package com.vishcn.common.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.common.com.vishcn.common.datasourc <br>
 * Description: <br>
 * DATE 15/5/18 16:56 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSource {

    String value() default "write";
}
