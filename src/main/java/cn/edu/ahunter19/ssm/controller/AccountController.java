package cn.edu.ahunter19.ssm.controller;

import cn.edu.ahunter19.ssm.domain.Account;
import cn.edu.ahunter19.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
    public String findAll(Model model){
        System.out.println("表现层：查询所有帐户信息...");
        List<Account> list = accountService.findAll();//调用service方法
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 保存帐户信息
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("表现层：查询所有帐户信息...");
        accountService.saveAccount(account);//调用service方法
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
