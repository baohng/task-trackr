package com.tasktrackr.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String taskName;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private LocalDate created_at;

    @Column(nullable = false)
    private LocalDate updated_at;

    @Column()
    private LocalDate deadline_at;

    @Column(nullable = false)
    private boolean isComplete;

    @ManyToOne(optional = false)
    private User user;

    @ManyToOne(optional = false)
    private Category category;
}
