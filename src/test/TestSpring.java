import cn.edu.ahunter19.ssm.domain.Account;
import cn.edu.ahunter19.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Spring环境测试类
 * @version 1.0.0
 * @className TestSpring
 * @anthor Administrator
 * @data 2019/7/2
 */
public class TestSpring {

    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
