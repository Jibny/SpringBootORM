package top.shmly.enterprise.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.shmly.enterprise.information.mapper.UserMapper;
import top.shmly.enterprise.information.model.User;
import top.shmly.enterprise.information.repository.UserRepository;
import top.shmly.enterprise.information.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }

    @Override
    public void createUser(String username, String password) {
        jdbcTemplate.update("insert into user(username,password) value(?,?)", username, password);
    }

    @Override
    public List<top.shmly.enterprise.information.entity.User> findAll() {
        List<top.shmly.enterprise.information.entity.User> users = userRepository.findAll();
        return users;
    }
}
