package tech.giver.contacts.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.giver.contacts.entity.Role;
import tech.giver.contacts.entity.User;
import tech.giver.contacts.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private static boolean first = true;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {

        if (first) {
            Role adminRole = new Role("ROLE_ADMIN");
            user.setRoles(Collections.singletonList(adminRole));
            first = false;
        } else {
            Role userRole = new Role("ROLE_USER");
            user.setRoles(Collections.singletonList(userRole));
        }
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
