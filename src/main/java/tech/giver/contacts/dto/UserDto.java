package tech.giver.contacts.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import tech.giver.contacts.entity.Role;

@NoArgsConstructor
@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private List<Role> roles;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
        roles = new ArrayList<>();
    }
}
