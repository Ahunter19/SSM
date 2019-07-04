package cn.edu.ahunter19.ssm.dao;

import cn.edu.ahunter19.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 帐户dap接口
 * @anthor ChenLiang
 * @data 2019/7/2
 * @version 1.0.0
 */
@Repository
public interface AccountDao {

    /**
     * 查询所有帐户信息
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();


    /**
     * 保存帐户信息
     * @param account
     */
    @Insert("Insert into account(username,money) values(#{username},#{money})")
    void saveAccount(Account account);
}
