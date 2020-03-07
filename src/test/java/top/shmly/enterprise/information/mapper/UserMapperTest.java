package top.shmly.enterprise.information.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.shmly.enterprise.information.InformationApplication;
import top.shmly.enterprise.information.model.User;

//加载主启动类
@SpringBootTest(classes = InformationApplication.class)
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void findById() {
        User user = userMapper.findById(1L);
    }


}