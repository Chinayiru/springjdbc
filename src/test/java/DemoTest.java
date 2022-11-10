import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yi.pojo.User;
import yi.service.UserServer;

/**
 * @aythor yi
 * @data 2022/11/10  16:51:53
 * @Description
 */
public class DemoTest {
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserServer userServer = context.getBean("userServer",UserServer.class);
        User user = new User();
        user.setId(10);
        user.setUsername("sang2");
        user.setPassword("2131231");
        userServer.addUser(user);
    }
}
