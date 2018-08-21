package com.example.utils.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by hb on 2018/8/18.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

    // 根据当前线程的数据源名称, 返回对应的DataSource对象
    @Override
    protected Object determineCurrentLookupKey() {
        log.info("使用数据源:{}", DataSourceContextHolder.getDB());
        return DataSourceContextHolder.getDB();
    }
}
