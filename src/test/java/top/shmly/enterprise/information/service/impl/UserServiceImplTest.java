package top.shmly.enterprise.information.service.impl;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.shmly.enterprise.information.InformationApplication;
import top.shmly.enterprise.information.service.UserService;


//加载主启动类
@SpringBootTest(classes = InformationApplication.class)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.createUser("root", "123456");
    }

}