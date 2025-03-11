package com.example;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<BorrowedBook> borrowedBooks = new HashSet<>();

    public Student() {}

    public Student(String name) {
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Set<BorrowedBook> getBorrowedBooks() { return borrowedBooks; }
}
