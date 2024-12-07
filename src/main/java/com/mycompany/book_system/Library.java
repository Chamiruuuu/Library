package com.mycompany.book_system;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Library {

    private ArrayList<Books> books;
    private ArrayList<Integer> bookId;

    public Library() {
        this.books = new ArrayList<>();
        this.bookId = new ArrayList<>();
    }

    public void addBook(int id, String title, String author, int yearPublish) {
        
        //check if ID already exist
        if (bookId.contains(id)) {
            JOptionPane.showMessageDialog(null, "Book ID already exist!");
            return;
        }
        Books book = new Books(id, title, author, yearPublish);
        JOptionPane.showMessageDialog(null, "Book added successfully!");
        books.add(book);
        bookId.add(id);
    }

  public void updateRecord() {
    int id;
    while (true) {
        try {
            String inputId = JOptionPane.showInputDialog(null,"Enter Book ID");
         
         if(inputId.isBlank()){
             JOptionPane.showMessageDialog(null, "Dont leave it blank!");
             continue;
         }
         id = Integer.parseInt(inputId);
         break;
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Invalid input Enter only numeric.");
    }
  }
    for (Books book : books) {
        if (book.getId() == id) {

            while (true) {                    
                String newTitle = JOptionPane.showInputDialog("Enter new book title:");
                if (newTitle.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Don't leave it blank");
                    continue; 
                }
                book.setTitle(newTitle);
                break; 
            }

            while (true) { 
                 String newAuthor = JOptionPane.showInputDialog("Enter new book author:");
                    if (newAuthor.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Don't leave it blank");
                        continue;
                    }
                    book.setAuthor(newAuthor);
                    break;
            }

            while (true) {                        
                try {
                    String newYear = JOptionPane.showInputDialog(null, "Enter published year");

                    if (newYear.isBlank()) {
                        JOptionPane.showMessageDialog(null, "Don't leave it blank");
                        continue; 
                    }
                   int newYearPub = Integer.parseInt(newYear);
                    book.setPublishedYear(newYearPub);
                    
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid year.");
                }
            }
            
            JOptionPane.showMessageDialog(null, "Update Successful!");
            return; 
        }
    }
    JOptionPane.showMessageDialog(null, "Book ID not found.");
}

    public void removeBook(int id) {
        for (Books book : books) {
            if (book.getId() == id) {
                books.remove(book);
                JOptionPane.showMessageDialog(null, "Book removed successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Book not found!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No books in the library!");
            return;
        }
        StringBuilder bookList = new StringBuilder("Books in the Library:\n");
        for (Books book : books) {
            bookList.append("Book ID: ").append(book.getId()).append("\n")
                    .append("Book Title: ").append(book.getTitle()).append("\n")
                    .append("Book Author: ").append(book.getAuthor()).append("\n")
                    .append("Book Published: ").append(book.getPublishedYear()).append("\n\n");

        }
        JOptionPane.showMessageDialog(null, bookList.toString());

    }
}
