package tech.giver.contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.giver.contacts.dto.UserDto;
import tech.giver.contacts.entity.User;
import tech.giver.contacts.service.UserService;
import tech.giver.contacts.util.Convert;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User createUser(@RequestBody UserDto userDto) {
        return userService.save(Convert.userDtoToUser(userDto));
    }

    @GetMapping("/{id}")
    public User info(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @PatchMapping("/{id}")
    public User changeAccount(@PathVariable("id") Long id, @RequestBody UserDto userDto) {
        return userService.updateById(userDto, id);
    }
}
