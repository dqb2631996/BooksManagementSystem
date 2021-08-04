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
    Book arrayList[];
    // câu 3.
    public void menu(){
        System.out.println("1. Insert New Book");
        System.out.println("2. View List of Books");
        System.out.println("3. Average Price");
        System.out.println("4. Exit");
    }
    public void insertNewBook(){
        //4
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        Book newsarrayList[] = new Book[arrayList.length+1];
        for (int i = 0; i < arrayList.length; i++) {
                newsarrayList[i] = arrayList[i];
        }
        book.name = sc.nextLine();
        book.publishDate = sc.nextLine();
        book.author = sc.nextLine();
        book.language = sc.nextLine();
        System.out.println("Nhap vao 5 danh gia :");
        System.out.println("notable 1:");
        String notable1 = sc.nextLine();
        System.out.println("notable 2:");
        String notable2 = sc.nextLine();
        System.out.println("notable 3:");
        String notable3 = sc.nextLine();
        System.out.println("notable 4:");
        String notable4 = sc.nextLine();
        System.out.println("notable 5:");
        String notable5 = sc.nextLine();
        
         newsarrayList[arrayList.length] = book;
         arrayList = newsarrayList;
    }
        public void run(){
        while (true) { 
            Scanner sc = new Scanner(System.in);
            menu();
            System.out.println("Nhập Thao Tác :");
            int nhap = sc.nextInt();
            if(nhap == 1 ){
                insertNewBook();
            }else if(nhap == 2){
                Book book = new Book();
                book.display();
            }else if(nhap == 3){
                Book book = new Book();
                book.calculate();
                System.out.println("Danh Gia Trung Binh : " + book.averagePrice);
                book.display();
            }else if(nhap == 4){
                break;
            }else{
                System.out.println("nhập sai thao tác");
            }
    }
    
}


}