package com.example;

import jakarta.persistence.Entity;

@Entity
public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook() {}

    public PrintedBook(String title, String authorName, int pageCount) {
        super(title, authorName);
        this.pageCount = pageCount;
    }

    public int getPageCount() { return pageCount; }
}
