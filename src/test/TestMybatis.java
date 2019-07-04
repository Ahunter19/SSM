import cn.edu.ahunter19.ssm.dao.AccountDao;
import cn.edu.ahunter19.ssm.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 测试mybatis环境
 * @version 1.0.0
 * @className TestMybatis
 * @anthor Administrator
 * @data 2019/7/4
 */
public class TestMybatis {

    /**
     * 测试查询所有帐户信息
     * @throws Exception
     */
    @Test
    public void runOne() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建sqlSession对象
        SqlSession sqlSession = factory.openSession();

        //获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        //调用方法
        List<Account> list = mapper.findAll();
        for (Account a : list){
            System.out.println(a);
        }

        //关闭资源
        sqlSession.close();
        inputStream.close();
    }


    /**
     * 测试添加帐户
     * @throws Exception
     */
    @Test
    public void runTwo() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建sqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        //创建sqlSession对象
        SqlSession sqlSession = factory.openSession();

        //获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);

        //调用方法
        Account account = new Account();
        account.setUsername("大大");
        account.setMoney(1000d);
        mapper.saveAccount(account);

        //提交事务
        sqlSession.commit();

        //关闭资源
        sqlSession.close();
        inputStream.close();
    }
}
