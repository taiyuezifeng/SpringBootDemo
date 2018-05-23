package top.taiyuezifeng.springbootdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Class: top.taiyuezifeng.springbootdemo.servlet.CustomServlet
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: CustomServlet用于演示Spring Boot整合自定义Servlet。
 */
public class CustomServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("Custom Servlet!");
    }

    @Override
    public void destroy() {
        System.out.println("=======销毁自定义Servlet=========");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("=======初始化自定义Servlet=========");
    }
}
