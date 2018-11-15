package cn.dzy.controller;

import cn.dzy.domain.Account;
import cn.dzy.service.MavenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@org.springframework.stereotype.Controller
@RequestMapping("/account")
public class Controller {
    @Autowired
    MavenService mavenService;
    @RequestMapping("/findAll")
    public String findAll(Model model){


        Account account = mavenService.findbyid(1);
        model.addAttribute("item", account);
        return "itemDetail";


    }



}
