package top.taiyuezifeng.springbootdemo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.taiyuezifeng.springbootdemo.filter.CustomFilter;
import top.taiyuezifeng.springbootdemo.listener.CustomListener;
import top.taiyuezifeng.springbootdemo.servlet.CustomServlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class: top.taiyuezifeng.springbootdemo.WebConfig
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: WebConfig用于演示Spring Boot整合自定义Servlet、Filter、Listener的配置方式。
 */
@Configuration
public class WebConfig {

    @Bean
    public ServletRegistrationBean customServletRegistrationBean() {
        return new ServletRegistrationBean(new CustomServlet(), "/servlet/demo");
    }

    @Bean
    public FilterRegistrationBean customFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        CustomFilter customFilter = new CustomFilter();
        filterRegistrationBean.setFilter(customFilter);

        List<String> urls = new ArrayList<>();
        urls.add("/*");
        filterRegistrationBean.setUrlPatterns(urls);

        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<CustomListener> customServletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
    }

}
