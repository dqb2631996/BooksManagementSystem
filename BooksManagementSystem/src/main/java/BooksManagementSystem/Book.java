/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BooksManagementSystem;

/**
 *
 * @author mac
 */
public class Book implements IBook {
    
    int id;
    String name;
    String publishDate;
    String author;
    String language;
    float averagePrice;
    int priceList [] = new int[5];

    @Override
    public void display() {
        
        System.out.println(name + publishDate + author + language + averagePrice);
        
    }
     public void calculate(){
       averagePrice = (float)(priceList[0] + priceList[1] +priceList[2]+priceList[3]+priceList[4])/5;
    }
    
    
    
}
