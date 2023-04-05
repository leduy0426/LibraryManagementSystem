/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author fpt
 */
public class Books {

    private String ID, ISBN;
    private String title, author;
    private LocalDate publicationDate;
    private boolean isAvailable;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private int maxBorrowDays;
    private Members borrower;

    public Books(String ID, String ISBN, String title, String author, LocalDate publicationDate, boolean isAvailable) {
        this.ID = ID;
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isAvailable = isAvailable;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getMaxBorrowDays() {
        return maxBorrowDays;
    }

    public void setMaxBorrowDays(int maxBorrowDays) {
        this.maxBorrowDays = maxBorrowDays;
    }

    public Members getBorrower() {
        return borrower;
    }

    public void setBorrower(Members borrower) {
        this.borrower = borrower;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = publicationDate.format(formatter);

        return String.format("|%8s|%30s|%-25s|%8s|%10s|%5s|\n",
                                                     ID, title, author, ISBN, publicationDate, isAvailable);
        
    }

    public Books(LocalDate borrowDate, LocalDate returnDate, int maxBorrowDays, Members borrower) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.maxBorrowDays = maxBorrowDays;
        this.borrower = borrower;
    }
    

    public void borrowBook(Members borrower) {
        if (isAvailable == true) {
            if (borrower.getNumBorrowedBooks() < borrower.getMaxBorrowedBooks()) {
                isAvailable = false;
                this.borrower = borrower;
                borrowDate = LocalDate.now();
                returnDate = null;

                System.out.println("Book successfully borrowed by " + borrower.getName());

            } else {
                System.out.println("This member has already borrowed the maximum number of books.");
            }
        } else {
            System.out.println("This book is not available for borrowing at the moment.");
        }
    }

    public void returnBook(Members a) {
        if (a == null) {
            System.out.println("Book has not been borrowed");
            return;
        }
        a.decreasenumBorrowedBooks();
        isAvailable = true;
        borrowDate = null;
        returnDate = LocalDate.now();
    }
    
    public void showBooksList(){
        System.out.printf("|%8s|%30s|%-25s|%8s|%10s|%5s|\n",
                ID, title, author, ISBN, publicationDate, isAvailable);
    
}
}
