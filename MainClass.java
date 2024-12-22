import java.util.Scanner;

import designProblems.MyPackage.*;
import designProblems.bankSystem.BankAccount;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Book book1 = new Book(123);
        // book1.borrowBook(123);
        // book1.returnBook(123);
        // System.out.println(book1.getTotalBooks());
        // StringBuilder str = new StringBuilder(); //String Builder and String buffer
        // revise from yt sandeep jain
        // System.out.println(book1); // Gives classname@hashcode hascode is unique for
        // each object
        // System.out.println(book1.toString());
        // CouresClass student1 = new CouresClass();
        // student1.enrollStudent("Aditi Sonkar");

        // Creation of student class and printing its values using toString;
        // Student stu1 = new Student("Addu", 21);
        // System.out.println(stu1);

        // Concatination of two strings and convert the result to uppercase;
        // String str1 = "My name is Aditi Sonkar I am a good girl";
        // String str2 = " I am 21 years old I am a very sweet girl";
        // String concatedString = str1.concat(str2);
        // System.out.print(concatedString.toUpperCase());
        // Circle circle = new Circle(5);
        // System.out.println(circle.area());
        // System.out.println(circle.circumference());
        BankAccount holder1 = new BankAccount();
        System.out.println(holder1.currentBalance());
        holder1.deposite(7000);
        holder1.withdraw(400);
        System.out.println(holder1.currentBalance());
        holder1.withdraw(8000);
    }
}