/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;


/**
 *
 * @author fpt
 */
public class Library {
    private Books book;
    private Members member;
    //private static ArrayList<Books> books = new ArrayList<Boo>
    //chưa rõ cách thức triển khai ArrayList vì cần lưu sách ra file .txt

    public Library(Books book, Members member) {
        this.book = book;
        this.member = member;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Members getMember() {
        return member;
    }

    public void setMember(Members member) {
        this.member = member;
    }

//    public void showBorrowedBooks(){
//        for (Books book : books){
//            if(!book.isIsAvailable()){
//                
//            }
//        }
//    }
}
