package com.tripplanner.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS_APP")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME", nullable = false, unique = true)
    private String username;

    @Column(name = "USER_MAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "USER_PASSWORD", nullable = false)
    private String password;
}
