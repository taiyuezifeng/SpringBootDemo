package top.taiyuezifeng.springbootdemo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Class: top.taiyuezifeng.springbootdemo.filter.CustomFilter
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: CustomFilter用于演示Spring Boot整合自定义Filter。自定义Filter生效有2种方法：1.使用@Component；2.在WebConfig中配置。
 */
//org.springframework.stereotype.@Component
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化自定义过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        long end = System.currentTimeMillis();
        long execTime = end - start;
        System.out.println("=======自定义过滤器执行耗时：" + execTime + "=========");
    }

    @Override
    public void destroy() {
        System.out.println("=======销毁自定义过滤器=========");
    }
}
