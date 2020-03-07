package top.shmly.enterprise.information.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import top.shmly.enterprise.information.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
