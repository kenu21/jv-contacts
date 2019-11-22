package tech.giver.contacts.util;

import tech.giver.contacts.dto.UserDto;
import tech.giver.contacts.entity.User;

public class Convert {
    public static User userDtoToUser(UserDto userDto) {
        User user = new User(userDto.getUsername(), userDto.getPassword());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setRoles(userDto.getRoles());
        return user;
    }
}
