package tech.giver.contacts.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@NoArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Role> roles;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        roles = new ArrayList<>();
    }

    public List<String> getRolesString() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < roles.size(); i++) {
            list.add(roles.get(i).getRoleName());
        }
        return list;
    }
}
