package com.crh.books_sys.controller;

import com.crh.books_sys.entity.Admin;
import com.crh.books_sys.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-11-15 11:26:01
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }

    @RequestMapping("addUser")
    public ModelAndView addUser(@RequestParam("acctName") String name, String password) {
        ModelAndView modelAndView = new ModelAndView();

        if (adminService.queryByName(name) > 0) {
            modelAndView.addObject("msg", "用户已存在！！");
            modelAndView.setViewName("register.html");

        } else {
            Admin admin = new Admin(null, name, password, new Date());
            int insert = adminService.insert(admin);
            if (insert > 0) {
                modelAndView.setViewName("login.html");
            } else {
                modelAndView.addObject("msg", "注册失败！！");
                modelAndView.setViewName("register.html");
            }
        }
        return modelAndView;

    }

    @RequestMapping("login")
    public ModelAndView login(@RequestParam("acctName") String name,String password){
        ModelAndView model=new ModelAndView();

        Integer login = adminService.login(name, password);
        if (login>0){
            model.setViewName("forward:/book/getAllBooks");

        }else {
            model.addObject("msg","登录失败！！");
            model.setViewName("login.html");
        }

        return model;
    }

}