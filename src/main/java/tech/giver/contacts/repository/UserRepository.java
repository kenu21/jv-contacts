package tech.giver.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.giver.contacts.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
