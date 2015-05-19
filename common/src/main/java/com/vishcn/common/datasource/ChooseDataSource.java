package com.vishcn.common.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * <p/>
 * Project: vishWeb <br>
 * Package com.vishcn.common.com.vishcn.common.datasourc <br>
 * Description: t choose com.vishcn.common.datasourc <br>
 * DATE 15/5/18 15:57 <br>
 *
 * @author Vishcn<br>
 * @version V1.0 <br>
 */
public class ChooseDataSource extends AbstractRoutingDataSource{


    @Override
    protected Object determineCurrentLookupKey() {
        return HandleDataSource.getDataSource();
    }


}
