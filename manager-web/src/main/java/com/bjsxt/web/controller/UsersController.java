package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        System.out.println("1");
        return "ll";
    }
    @RequestMapping(value = "/searchresult")
    public ModelAndView searchresult(){
        List<Users> users = this.usersService.selectUserAll();
        //System.out.println("1");
        StringBuilder stringBuilder = new StringBuilder();
//        if (users.size()>0){
//            System.out.println(users);
//        }
        //String s = users.toString();
        ModelAndView ff = new ModelAndView();
        ff.addObject("users",users);
        ff.setViewName("searchend");
        return ff;
    }

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGet.........."+userid);
        return "ok";
    }
    /**
     * doPost
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doGet(Users users){
        System.out.println("doPost..........");
        System.out.println(users);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doDelete.........."+userid);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut..........");
        return "ok";
    }

}
