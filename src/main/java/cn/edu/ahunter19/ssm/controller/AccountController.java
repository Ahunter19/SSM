package cn.edu.ahunter19.ssm.controller;

import cn.edu.ahunter19.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 帐户web控制器类
 * @version 1.0.0
 * @className AccountController
 * @anthor Administrator
 * @data 2019/7/2
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有帐户信息
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：查询所有帐户信息...");
        accountService.findAll(); //调用service方法
        return "list";
    }
}
