package com.github.mattkain99.LANOrganizer.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Length(min=1)
    @Column(name="userName", unique = true)
    private String userName;

    @Length(min=1)
    @Column(name="firstName")
    private String firstName;

    @Length(min=1)
    @Column(name="lastName")
    private String lastName;

    @Length(min=1)
    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

}