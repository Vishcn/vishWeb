package com.vishcn.common.datasource;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.common.com.vishcn.common.datasourc <br>
 * Description: 解决线程安全问题<br>
 * DATE 15/5/18 16:09 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public class HandleDataSource {

    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void setDataSource(String dataSource) {
        holder.set(dataSource);
    }

    public static String getDataSource() {
        return holder.get();
    }
}
