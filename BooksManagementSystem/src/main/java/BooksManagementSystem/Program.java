/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BooksManagementSystem;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Program {

    Book arrayList[] = {};

    // câu 3.
    public void menu() {
        System.out.println("1. Insert New Book");
        System.out.println("2. View List of Books");
        System.out.println("3. Average Price");
        System.out.println("4. Exit");
    }

    public void insertNewBook() {
        //4
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        Book newarrayList[] = new Book[arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            newarrayList[i] = arrayList[i];
        }
        System.out.println("nhap name");
        book.name = sc.nextLine();
        
        System.out.println("nhap publishDate");
        book.publishDate = sc.nextLine();
        
        System.out.println("nhap author");
        book.author = sc.nextLine();
        
        System.out.println("nhap language");
        book.language = sc.nextLine();
        
        System.out.println("Nhap vao 5 danh gia :");
//        Book b = new Book();
        
        System.out.println("notable 1:");
        book.priceList[0] = sc.nextInt();
        System.out.println("notable 2:");
        book.priceList[1] = sc.nextInt();
        System.out.println("notable 3:");
        book.priceList[2] = sc.nextInt();
        System.out.println("notable 4:");
        book.priceList[3] = sc.nextInt();
        System.out.println("notable 5:");
        book.priceList[4] = sc.nextInt();
 
//        book.priceList = notable1
        newarrayList[arrayList.length] = book;
        arrayList = newarrayList;
        }

    public void run() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("Nhập Thao Tác :");
            int nhap = sc.nextInt();
            if (nhap == 1) {
                insertNewBook();
                int a = 0;
                System.out.println(a = arrayList.length);
            } else if (nhap == 2) {
//                Book book = new Book();
//                book.display();
//                arrayList[0].display();
//                arrayList[1].display();
//                arrayList[2].display();
//                arrayList[3].display();
//                arrayList[400].display();
                for (Book book : arrayList) {
                    book.display();
                }
            } else if (nhap == 3) {
//                System.out.println("Danh Gia Trung Binh : " + book.averagePrice);
//                book.display();

                for (Book book : arrayList) {
                    book.calculate();
                    book.display();
                }
            } else if (nhap == 4) {
                break;
            } else {
                System.out.println("nhập sai thao tác");
            }
        }

    }

}
