package top.shmly.enterprise.information.service;

import top.shmly.enterprise.information.model.User;

import java.util.List;

public interface UserService {
    User findUserById(Long id);

    void createUser(String username, String password);

    List<top.shmly.enterprise.information.entity.User> findAll();
}
