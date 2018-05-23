package top.taiyuezifeng.springbootdemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Class: top.taiyuezifeng.springbootdemo.listener.CustomListener
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: CustomListener用于
 */
public class CustomListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("=======初始化自定义监听器=========");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
