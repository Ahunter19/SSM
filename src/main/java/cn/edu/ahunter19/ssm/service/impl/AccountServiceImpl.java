package cn.edu.ahunter19.ssm.service.impl;

import cn.edu.ahunter19.ssm.domain.Account;
import cn.edu.ahunter19.ssm.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 帐户service接口实现类
 * @version 1.0.0
 * @className AccountServiceImpl
 * @anthor Administrator
 * @data 2019/7/2
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有帐户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存帐户...");
    }
}
