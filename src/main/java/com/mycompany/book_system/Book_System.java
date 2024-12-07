package com.mycompany.book_system;

import javax.swing.JOptionPane;

public class Book_System {

    public static void main(String[] args) {

        Library library = new Library();

        while (true) {
            String menu = "1. Add Book\n2. Remove Book\n3. Update Record\n4. View Books\n 5. Exit ";
            String input = JOptionPane.showInputDialog(menu + "\nEnter Option:");

            int userOption;
            try {
                userOption = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
                continue;
            }

            switch (userOption) {
                case 1:
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Enter book ID:"));
                    String title = JOptionPane.showInputDialog("Enter book title:");
                    String author = JOptionPane.showInputDialog("Enter book author:");
                    int yearPub = Integer.parseInt(JOptionPane.showInputDialog("Enter year published:"));

                    library.addBook(id, title, author, yearPub);
                    break;
                case 2:
                    try {
                        int bookIdRemove = Integer.parseInt(JOptionPane.showInputDialog("Enter book ID to remove:"));
                        library.removeBook(bookIdRemove);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid ID.");
                    }
                    break;
                case 3:
                   library.updateRecord();
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Input");

            }
        }
    }
}
