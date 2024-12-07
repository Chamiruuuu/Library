package com.mycompany.book_system;

public class Books {

    private String title;
    private String author;
    private int id;
    private int yearPublish;

    public Books(int id, String title, String author, int yearPublish) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublish = yearPublish;
    }
    
    public void setId(int id) {
      this.id = id;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public void setPublishedYear(int yearPublish) {
        this.yearPublish = yearPublish;
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return  yearPublish;
    }

}
