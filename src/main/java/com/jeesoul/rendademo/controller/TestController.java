package com.jeesoul.rendademo.controller;

import com.jeesoul.rendademo.domain.HomeWork;
import com.jeesoul.rendademo.service.HomeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author：dxy
 * @date : 2020-02-20
 */
@Controller
@RequestMapping
public class TestController {

    @Autowired
    private HomeWorkService homeWorkService;

    @RequestMapping("login")
    public String login(HttpServletResponse response) {
        return "login";

    }

    @RequestMapping("search/{name}")
    public String demo(@PathVariable String name, Model model) {
        List<HomeWork> list = homeWorkService.findHomeListByName(name);
        model.addAttribute("homeworkList", list);
        return "index";

    }


    @RequestMapping("android")
    public String android(HttpServletResponse response) {
        return "android";

    }

}
