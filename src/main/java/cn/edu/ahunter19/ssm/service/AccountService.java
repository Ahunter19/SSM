package cn.edu.ahunter19.ssm.service;

import cn.edu.ahunter19.ssm.domain.Account;

import java.util.List;

/**
 * 帐户service接口
 * @anthor ChenLiang
 * @data 2019/7/2
 * @version 1.0.0
 */
public interface AccountService {

    /**
     * 查询所有帐户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 保存帐户信息
     * @param account
     */
    void saveAccount(Account account);
}
