package com.github.mattkain99.LANOrganizer.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="users_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    UUID id;

    @Column(name="user_id")
    UUID userId;

    @Column(name="privilege")
    String privilege;

}
