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
public class Members {
    private String memberID, name;
    private String address, phoneNumber;
    private int numBorrowedBooks;
    private int maxBorrowedBooks;

    public Members(String memberID, String name, String address, String phoneNumber, int numBorrowedBooks, int maxBorrowedBooks) {
        this.memberID = memberID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numBorrowedBooks = numBorrowedBooks;
        this.maxBorrowedBooks = maxBorrowedBooks; // giới hạn số lượng sách mượn ở đây
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumBorrowedBooks() {
        return numBorrowedBooks;
    }

    public void setNumBorrowedBooks(int numBorrowedBooks) {
        this.numBorrowedBooks = numBorrowedBooks;
    }

    public int getMaxBorrowedBooks() {
        return maxBorrowedBooks;
    }

    public void setMaxBorrowedBooks(int maxBorrowedBooks) {
        this.maxBorrowedBooks = maxBorrowedBooks;
    }

 
    public void decreasenumBorrowedBooks(){
       this.numBorrowedBooks--;
            
        }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%30s|%10s|%3s|%3s|",
                                                                memberID, name, address, phoneNumber, numBorrowedBooks, maxBorrowedBooks);
    }
    
    public void showMembersList(){
        System.out.printf("|%8s|%-25s|%30s|%10s|%3s|%3s|\n", 
                                                            memberID, name, address, phoneNumber, numBorrowedBooks, maxBorrowedBooks);
    }
    }
    
