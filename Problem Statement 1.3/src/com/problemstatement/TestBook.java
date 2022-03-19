package com.problemstatement;

import java.util.Scanner;

public class TestBook
{
	public static Book[] createBooks(int n) {
	    // Scanner scan = new Scanner(System.in);
	    // int n= scan.nextInt();
	    
	    Book obj[]= new Book[n];

	    for(int i=0; i<n; i++){
	      obj[i]= new Book();
	      obj[i].setBook_title("Title "+ i);
	      obj[i].setBook_price(i*100);
	    }
	    
	    return obj;
	  }

	  public static void showBooks(Book obj[], int n) {
	    System.out.println("Book Title      Price");
	    for(int i=0; i<n; i++){
	      System.out.print(obj[i].getBook_title());
	      System.out.print("      ");
	      System.out.println(obj[i].getBook_price());
	    }
	  }
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
        
        System.out.println("Enter the Book name:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        int price=sc.nextInt();
        sc.nextLine();
        
        
        Book obj=new Book();
        
        obj.setBook_title(bookname);
        obj.setBook_price(price);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBook_title());
        System.out.println("Book Price :"+obj.getBook_price());
        showBooks(createBooks(n), n);
        
       
    }
}

