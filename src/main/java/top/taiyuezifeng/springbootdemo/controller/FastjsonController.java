package top.taiyuezifeng.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.taiyuezifeng.springbootdemo.entity.FastJson;

import java.util.Date;

/**
 * @Class: top.taiyuezifeng.springbootdemo.controller.FastjsonController
 * @Date: 2018-05-23
 * @Author: taiyuezifeng
 * @Version: 1.0.0
 * @Description: FastjsonController用于演示Spring Boot整合Fastjson。
 */
@Controller
@RequestMapping("fastjson")
public class FastjsonController {

    @RequestMapping(value = {"/", "demo"})
    @ResponseBody
    public FastJson testFastJson() {
        FastJson fastJson = new FastJson();
        fastJson.setIntegerData(1);
        fastJson.setStringData("Michael Bush");
        fastJson.setDateData(new Date());
        return fastJson;
    }

}
