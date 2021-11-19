package com.tencent.ciam.samples.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author figozhang
 */
@Controller
public class DefaultController {

    @GetMapping("/")
    public String root() {
        return "redirect:/userinfo";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
