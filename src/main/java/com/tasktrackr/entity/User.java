package com.tasktrackr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String hashedPassword;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL, CascadeType.REMOVE }, mappedBy = "user")
    private List<Task> tasks = new ArrayList<>();
}
