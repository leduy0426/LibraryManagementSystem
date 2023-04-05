/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

import data.Books;
import data.Members;
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
        addANewBook();
        Books book1 = new Books("a", "b", "c", "d",LocalDate.of(2023, 02, 21) , true);
        System.out.println("Them cuon sach a:  " + book1);
         Members member1 = new Members("231", "TV", "23 dafp", "0123454", 0, 10);
        book1.borrowBook(member1);
        System.out.println("ngay tra sach 1" + book1.getReturnDate());
        book1.setReturnDate(LocalDate.MIN);
    }

    public static void addANewBook() {
        String ID, ISBN;
        String title, author;
        boolean isAvailable;

        Scanner sc = new Scanner(System.in);

        System.out.println("Which book would you like to add to the library? ");

        System.out.println("Input ID : ");
        ID = sc.nextLine();

        System.out.println("Input title: ");
        title = sc.nextLine();

        System.out.println("Input author: ");
        author = sc.nextLine();

        System.out.println("Input ISBN: ");
        ISBN = sc.nextLine();

        
        
        while(true){
            try{
        System.out.println("In put publication date: ");
        String inputDate = sc.nextLine();       
        LocalDate pubicationDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Publication date: " + pubicationDate);

        isAvailable = true;
        System.out.println("Available: ");
        isAvailable = sc.nextBoolean();
        sc.nextLine();
            break;
            }catch(Exception e){
                System.out.println("Wrong input: "); 
            }
        }
        
        

        System.out.println("Book added successfully!");
    }

    public static void addANewMember() {
        String memberID, name;
        String address, phoneNumber;
        int numBorrowedBooks;
        int maxBorrowedBooks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Add a new member ");

        System.out.println("Input member ID : ");
        memberID = sc.nextLine();

        System.out.println("Input name: ");
        name = sc.nextLine();

        System.out.println("Address: ");
        address = sc.nextLine();

        System.out.println("Phone number: ");
        phoneNumber = sc.nextLine();
        
        try {
        System.out.println("Borrowed Books: ");
        numBorrowedBooks = sc.nextInt();

        System.out.println("Max borrowed books: ");
        maxBorrowedBooks = sc.nextInt();    
        } catch (Exception e) {
            System.out.println("Wrong input: ");
        }
        
        System.out.println("Member added successfully!");
    }

}
