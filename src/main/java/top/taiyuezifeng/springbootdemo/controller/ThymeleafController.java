package top.taiyuezifeng.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @类全限定名: top.taiyuezifeng.springbootdemo.controller.ThymeleafController
 * @创建日期: 2018-05-22
 * @创建人: taiyuezifeng
 * @版本号: 1.0.0
 * @描述: ThymeleafController用于演示Spring Boot 整合Thymeleaf模板引擎开发Web功能。
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping(value = {"/", "/demo"})
    public String thymeleaf(Map<String, Object> map) {
        map.put("msg", "Hello Thymeleaf!");
        return "thymeleaf";
    }

}
