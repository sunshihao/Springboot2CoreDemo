package com.sssh.setting;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ========================
 *  这种配置的配置项多样一些，而且配置集中，资料多
 * ========================
 */

// Configuration 将一个类看做beans的xml配置
@Configuration
public class DruidConfiguration {


    @Autowired
    private Environment env;

    @Bean
    public ServletRegistrationBean statViewServlet() {
        //创建servlet注册实体
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //设置ip白名单
        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
        //设置ip黑名单，如果allow与deny共同存在时,deny优先于allow
        servletRegistrationBean.addInitParameter("deny", "192.168.0.19");
        //设置控制台管理用户
        servletRegistrationBean.addInitParameter("loginUsername", "druid");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        //是否可以重置数据
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }


//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(env.getProperty("url"));
//        datasource.setDriverClassName(env.getProperty("driver-class-name"));
//        datasource.setUsername(env.getProperty("username"));
//        datasource.setPassword(env.getProperty("password"));
//        datasource.setInitialSize(Integer.valueOf(env.getProperty("initialSize")));
//        datasource.setMinIdle(Integer.valueOf(env.getProperty("minIdle")));
//        datasource.setMaxWait(Long.valueOf(env.getProperty("maxWait")));
//        datasource.setMaxActive(Integer.valueOf(env.getProperty("maxActive")));
//        datasource.setMinEvictableIdleTimeMillis(
//                Long.valueOf(env.getProperty("minEvictableIdleTimeMillis")));
//        try {
//            datasource.setFilters("stat,wall");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return datasource;
//    }

    @Bean
    public FilterRegistrationBean statFilter() {
        //创建过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //设置过滤器过滤路径
        filterRegistrationBean.addUrlPatterns("/*");
        //忽略过滤的形式
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
//        return new DruidDataSource();
        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(env.getProperty("url"));
//        datasource.setDriverClassName(env.getProperty("driver-class-name"));
//        datasource.setUsername(env.getProperty("username"));
//        datasource.setPassword(env.getProperty("password"));
//        datasource.setInitialSize(Integer.valueOf(env.getProperty("initialSize")));
//        datasource.setMinIdle(Integer.valueOf(env.getProperty("minIdle")));
//        datasource.setMaxWait(Long.valueOf(env.getProperty("maxWait")));
//        datasource.setMaxActive(Integer.valueOf(env.getProperty("maxActive")));
//        datasource.setMinEvictableIdleTimeMillis(
//                Long.valueOf(env.getProperty("minEvictableIdleTimeMillis")));
        // 这样sql的监控才能出来  ！！！！！！！！
        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }

}
