package com.lhl.jpa.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfigure {

    @Autowired
    private Environment env;

    private static final String JDBC_URL;
    private static final String DRIVER_CLASS;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        JDBC_URL = "spring.datasource.url";
        DRIVER_CLASS = "com.mysql.jdbc.Driver";
        USERNAME = "spring.datasource.username";
        PASSWORD = "spring.datasource.password";
    }

    @Bean(name = "datasource")
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(env.getProperty(JDBC_URL));
        dataSource.setDriverClassName(env.getProperty(DRIVER_CLASS));
        dataSource.setUsername(env.getProperty(USERNAME));
        dataSource.setPassword(env.getProperty(PASSWORD));
        return dataSource;
    }

    /*@Bean
    public OpenEntityManagerInViewFilter openEntityManagerInViewFilter() {
        return new OpenEntityManagerInViewFilter();
    }*/
}
