package com.example.utils.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 保存当前线程使用的数据源名称
 *
 * Created by hb on 2018/8/18.
 */
public class DataSourceContextHolder {
    private static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

    /**
     * 默认数据源
     */
    public static final String DEFAULT_DS = "ds1";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return DEFAULT_DS;
        }
    };

    // 设置数据源名
    public static void setDB(String dbType) {
        dbType = dbType.toLowerCase();
        log.info("切换到数据源:{}", dbType);
        contextHolder.set(dbType);
    }

    // 获取数据源名
    public static String getDB() {
        return (contextHolder.get());
    }

    // 切换到默认数据源
    public static void resetDB() {
        log.info("切换到默认数据源:{}", DEFAULT_DS);
        contextHolder.set(DEFAULT_DS);
    }

    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();
    }
}
