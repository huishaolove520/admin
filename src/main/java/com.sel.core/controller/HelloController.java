package com.sel.core.controller;

import com.sel.core.dao.IMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @Autowired
    private IMenuDao iMenuDao;

    @RequestMapping(value = "/hello")
    public @ResponseBody String hello(){
        return "chengognl la a ";
    }

    @RequestMapping(value = "/index")
    public String index(Model model){
        System.out.println("get in index");
        model.addAttribute("menus", iMenuDao.getAllMenu());
        return "index";
    }
}
