/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fpt
 */
public class Library {

    private String name;
    private String address;
    private Books book;
    private Members borrower;

    private Scanner sc = new Scanner(System.in);
    private int countBook = 0;
    private int countMember = 0;

    private Books ds[] = new Books[1000];
    private Members mb[] = new Members[200];
    //private static ArrayList<Books> books = new ArrayList<Boo>
    //chưa rõ cách thức triển khai ArrayList vì cần lưu sách ra file .txt

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
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

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Members getBorrower() {
        return borrower;
    }

    public void setBorrower(Members borrower) {
        this.borrower = borrower;
    }


    //TẠO ĐC PT THÊM SÁCH VÀO LIBRARY NHƯNG CHƯA HIỂU CÁCH TẠO THƯ VIỆN RỖNG
//    public Library() {
//        booksList = new ArrayList<>();
//        membersList = new ArrayList<>();
//        borrowingList = new ArrayList<>();
//    }         
    //-> giải pháp: chơi bằng phương pháp khác
    //hỏi muốn tạo bao nhiêu sách
    //tạo ra Library với khả năng lưu trữ 1 lượng sách cho trước
    //bằng cách dùng mảng hoặc tạo tham số trong constructor Library
    //đang dùng cách tạo ra 1 thư viện với 1000 sách
    public void addANewBook() {
        String ID, ISBN;
        String title, author;
        boolean isAvailable;

        System.out.println("Input infomation from book #" + (countBook + 1) + "/" + ds.length);
        System.out.print("Input ID : ");
        ID = sc.nextLine();
        System.out.print("Input title: ");
        title = sc.nextLine();
        System.out.print("Input author: ");
        author = sc.nextLine();
        System.out.print("Input ISBN: ");
        ISBN = sc.nextLine();
        while (true) {
            try {
                System.out.println("In put publication date: ");
                String inputDate = sc.nextLine();
                LocalDate pubicationDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.println("Publication date: " + pubicationDate);

                isAvailable = true;
                System.out.println("Available: ");
                isAvailable = sc.nextBoolean();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Wrong input: ");
            }
        }
        ds[countBook] = new Books(ID, ISBN, title, author, LocalDate.MIN, isAvailable);
        countBook++;
        System.out.println("Book added successfully!");
    }

    public void addANewMember() {
        String memberID, name;
        String address, phoneNumber;
//        int numBorrowedBooks;
//        int maxBorrowedBooks;
       

        System.out.println("Input infomation of member #" + (countMember+1) + "/" + mb.length);

        System.out.print("Input member ID : ");
        memberID = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();

        System.out.print("Phone number: ");
        phoneNumber = sc.nextLine();

        //đoạn này mượn sách chứ liên quan gì đến add member?
//        try {
//            System.out.println("Borrowed Books: ");
//            numBorrowedBooks = sc.nextInt();
//
//            System.out.println("Max borrowed books: ");
//            maxBorrowedBooks = sc.nextInt();
//        } catch (Exception e) {
//            System.out.println("Wrong input: ");
//        }
        //Members borrower = new Members(memberID, name, address, phoneNumber);
        mb[countMember] = new Members(memberID, name, address, phoneNumber);
        mb[countMember].setNumBorrowedBooks(0);
        mb[countMember].setMaxBorrowedBooks(3);
       
        countMember++;
        
        System.out.println("Member added successfully!");
    }
    
    public void borrowABook(){
        System.out.println("Which book would you like to borrow? ");
        System.out.println("In put the ID of the book that you want to borrow");
        String id = sc.nextLine();
        
        //Tìm sách theo ID
        Books book = null;
        for (int i = 0; i < countBook; i++) {
            if(ds[i].getID().equalsIgnoreCase(id)){
                book = ds[i];
                
                break;
            }
        }
        //Thấy sách -> yêu cầu thành viên mượn sách
        if (book != null){
            System.out.println("Is this the book you want to borrow?");
            book.bookInfomation();
            System.out.println("Enter member ID");
            String memberID = sc.nextLine();
        
            //Tìm kiếm thành viên theo ID
            Members borrower = null;
            for (int i = 0; i < countMember; i++) {
                if (mb[i].getMemberID().equalsIgnoreCase(memberID)){
                borrower = mb[i];
                break;
            }
        }
        // Nếu tìm thấy thành viên, mượn sách
        if (borrower != null){
            
            book.borrowBook(borrower);
            System.out.println("Book borrowed successfully!");
        }else{
            System.out.println("Cannot find the member with ID");
        }    
    }else{
            System.out.println("Cannot find the book with ID" + id);
        }   
        }
        
        
        
    

    public void showTheListOfBooks() {
        System.out.println("The list of books in the library");
        for (int i = 0; i < countBook; i++) {
            ds[i].showBooksList();
        }
    }

    public void showTheListOfMembers() {
        System.out.println("The list of members in the library");
        for (int i = 0; i < countMember; i++) {
            mb[i].showMembersList();
        }
    }
    
    public void showBorrowedList(){
        System.out.println("The borrowed list from library");
        
    }

//    public void showBorrowedBooks(){
//        for (Books book : books){
//            if(!book.isIsAvailable()){
//                
//            }
//        }
//    }
}
