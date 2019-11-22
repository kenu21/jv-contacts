package tech.giver.contacts.service;

import tech.giver.contacts.dto.UserDto;
import tech.giver.contacts.entity.User;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    User getById(Long id);

    User updateById(UserDto userDto, Long id);
}
