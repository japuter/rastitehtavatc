package com.example;

import java.time.LocalDate;

public class LibraryMain {
    public static void main(String[] args) {
        // Create Entities
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Author author1 = new Author("J.K. Rowling");
        Biography bio1 = new Biography("Author of Harry Potter", author1);
        author1.getBiography();

        Book book1 = new EBook("Harry Potter", "J.K. Rowling", "http://ebook.com/hp");
        Book book2 = new PrintedBook("Lord of the Rings", "J.R.R. Tolkien", 500);

        BorrowedBook borrowed1 = new BorrowedBook(student1, book1, LocalDate.now());
        BorrowedBook borrowed2 = new BorrowedBook(student2, book2, LocalDate.now());

        // Save Data
        LibraryDAO.saveEntity(student1);
        LibraryDAO.saveEntity(student2);
        LibraryDAO.saveEntity(author1);
        LibraryDAO.saveEntity(bio1);
        LibraryDAO.saveEntity(book1);
        LibraryDAO.saveEntity(book2); 
        LibraryDAO.saveEntity(borrowed1);
        LibraryDAO.saveEntity(borrowed2);

        System.out.println("Sample data inserted successfully!");
        LibraryDAO.close();
    }
}
