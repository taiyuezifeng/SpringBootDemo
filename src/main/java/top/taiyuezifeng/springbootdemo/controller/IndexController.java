package top.taiyuezifeng.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(path = {"/", "index"})
    public String index() {
        return "This is index page!";
    }

}
