package com.example;

import jakarta.persistence.Entity;

@Entity
public class EBook extends Book {
    private String downloadUrl;

    public EBook() {}

    public EBook(String title, String authorName, String downloadUrl) {
        super(title, authorName);
        this.downloadUrl = downloadUrl;
    }

    public String getDownloadUrl() { return downloadUrl; }
}
