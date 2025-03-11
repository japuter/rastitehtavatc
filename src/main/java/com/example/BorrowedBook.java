package com.example;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Book book;

    private LocalDate borrowDate;

    public BorrowedBook() {}

    public BorrowedBook(Student student, Book book, LocalDate borrowDate) {
        this.student = student;
        this.book = book;
        this.borrowDate = borrowDate;
    }

    public Long getId() { return id; }
    public Student getStudent() { return student; }
    public Book getBook() { return book; }
    public LocalDate getBorrowDate() { return borrowDate; }
}
