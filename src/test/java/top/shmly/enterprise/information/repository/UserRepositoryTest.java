package top.shmly.enterprise.information.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.shmly.enterprise.information.InformationApplication;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = InformationApplication.class)
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        userRepository.findById(1L);
    }
}