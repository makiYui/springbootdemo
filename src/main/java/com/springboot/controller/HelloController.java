package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hp on 2018/5/24.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hellospringboot")
    public @ResponseBody String hellospringboot() {
        return "hellospringboot";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", "25");
        model.addAttribute("sex", "man");
        model.addAttribute("birth", new Date());
        return "hello";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Map<String, Object> json() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Flyat");
        map.put("age", "25");
        map.put("sex", "man");
        return map;
    }
}
