package cn.edu.ahunter19.ssm.dao.impl;

import cn.edu.ahunter19.ssm.dao.AccountDao;
import cn.edu.ahunter19.ssm.domain.Account;
import java.util.List;

/**
 * 帐户dao接口实现类
 *
 * @version 1.0.0
 * @className AccountDaoImpl
 * @anthor Administrator
 * @data 2019/7/2
 */
public class AccountDaoImpl implements AccountDao {

    @Override
    public List<Account> findAll() {
        System.out.println("持久层，查询所有帐户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("持久层，保存帐户...");
    }
}
