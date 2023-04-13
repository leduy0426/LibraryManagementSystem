/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

import data.Books;
import data.Library;
import data.Members;
import data.Tools;
import java.awt.print.Book;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author fpt
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Library l = new Library(book, member); //PHẢI TẠO CONSTRUCTOR K THAM SỐ
                                                 //ĐỂ KHỞI TẠO 1 THƯ VIỆN RỖNG SAU ĐÓ
                                                 //MỚI THÊM CÁC BOOKS VÀ MEMBERS
                            //->giải pháp: đang giả sử nạp 1 thư viện với 1000 sách và 200 thành viên
                            //             có thể tham số số sách cho thư viện trong constructor
                            //cần tạo menu để các member lựa chọn 
                                                 
                                                 
//        Books book1 = new Books("a", "b", "c", "d",LocalDate.of(2023, 02, 21) , true);
//        System.out.println("Them cuon sach a:  " + book1);
//        Members member1 = new Members("231", "TV", "23 dafp", "0123454", 0, 10);
//        book1.borrowBook(member1);
//        System.out.println("ngay tra sach 1" + book1.getReturnDate());
//        book1.setReturnDate(LocalDate.MIN);
        
        Scanner sc = new Scanner(System.in);
        int choice;
        Library library = new Library("IT", "Fresher");
        
        do {
            printMenu();
            System.out.print("Input your choice (1...8):");
            choice = Tools.getAnInteger();
            
            switch (choice) {
                case 1:
                    library.addANewBook();
                    break;
                case 2:
                    library.addANewMember();
                    break;
                case 3:
                    library.showTheListOfBooks();
                    break;
                case 4:
                    library.showTheListOfMembers();
                    break;
                case 5: 
                    library.borrowABook();
                    break;
                case 6:
                    library.returnABook();
                    break;
                case 7:
                    library.showBorrowedList();
                    break;
                case 8:
                    library.deleteABook();
                    break;
                case 9:
                    library.deleteAMember();
                case 10:
                    System.out.println("Good bye! See you again!");
                default:
                    System.out.println("Please choose 1 to 10");
                    break;
            }
        } while(choice != 10 );
        
    } 
    
    public static void printMenu(){
        System.out.println("Welcome to Fresher Academic Portal");
        System.out.println("Choose the following functions that you want");
        System.out.println("1. Add a book");
        System.out.println("2. Add a member");
        System.out.println("3. Show the list of books");
        System.out.println("4. Show the list of members");
        System.out.println("5. Borrow a book");
        System.out.println("6. Return a book");
        System.out.println("7. Show borrowed list");
        System.out.println("8. Delete a book");
        System.out.println("9. Delete a member");
        System.out.println("10. Quit");
    }
    
    //ĐÃ CHUYỂN PHƯƠNG THỨC NÀY VÀO LIBRARY
//   public static void addANewBook() {
//        String ID, ISBN; 
//        String title, author;
//        boolean isAvailable;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Which book would you like to add to the library? ");
//
//        System.out.println("Input ID : ");
//        ID = sc.nextLine();
//
//        System.out.println("Input title: ");
//        title = sc.nextLine();
//
//        System.out.println("Input author: ");
//        author = sc.nextLine();
//
//        System.out.println("Input ISBN: ");
//        ISBN = sc.nextLine();
//
//        
//        
//        while(true){
//            try{
//        System.out.println("In put publication date: ");
//        String inputDate = sc.nextLine();       
//        LocalDate pubicationDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println("Publication date: " + pubicationDate);
//
//        isAvailable = true;
//        System.out.println("Available: ");
//        isAvailable = sc.nextBoolean();
//        sc.nextLine();
//            break;
//            }catch(Exception e){
//                System.out.println("Wrong input: "); 
//            }
//        }
//        
//        
//
//        System.out.println("Book added successfully!");
//    }

    //CHUYỂN VÀO LIBRARY
//    public static void addANewMember() {
//        String memberID, name;
//        String address, phoneNumber;
//        int numBorrowedBooks;
//        int maxBorrowedBooks;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Add a new member ");
//
//        System.out.println("Input member ID : ");
//        memberID = sc.nextLine();
//
//        System.out.println("Input name: ");
//        name = sc.nextLine();
//
//        System.out.println("Address: ");
//        address = sc.nextLine();
//
//        System.out.println("Phone number: ");
//        phoneNumber = sc.nextLine();
//        
//        try {
//        System.out.println("Borrowed Books: ");
//        numBorrowedBooks = sc.nextInt();
//
//        System.out.println("Max borrowed books: ");
//        maxBorrowedBooks = sc.nextInt();    
//        } catch (Exception e) {
//            System.out.println("Wrong input: ");
//        }
//        
//        System.out.println("Member added successfully!");
//    }

}
