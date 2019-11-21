package tech.giver.contacts.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private Integer numberPhone;
    private String address;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<GroupContacts> groupContacts;

    public Contact(String firstname, String lastname, Integer numberPhone, String address,
                   User user, List<GroupContacts> groupContacts) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.numberPhone = numberPhone;
        this.address = address;
        this.user = user;
        this.groupContacts = groupContacts;
    }
}
