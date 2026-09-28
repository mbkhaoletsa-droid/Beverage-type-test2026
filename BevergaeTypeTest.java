/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bevergaetypetest;

import java.util.Scanner;

public class BevergaeTypeTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        while(running){
        
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) Xbox");
        System.out.println("3) SWITCH");
        
        String choice = scanner.nextLine();
        switch(choice){
        
        case "1" : PS5(); break;
        case "2" : XBOX(); break;
        case "3" : SWITCH(); break;
        
            default:
                System.out.println("Invalid choice. Please try again");
    
    }
        
        }
        
        scanner.close();
        
        
        
    }
    
}

private static void PS5(){
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the store: ");
     String storeName = scanner.nextLine();
     
     System.out.print("Enter the total sales of PS5 consoles for Number 1 Electronic Store: ");
     String storeSales = scanner.nextLine();
     
     System.out.println(" ");
     
     System.out.println("CONSOLE SALES REPORT");
     System.out.println("********************");
     System.out.println("CONSOLE TYPE: PS5");
     System.out.println("Store: " + storeName);
     System.out.println("TOTAL SALES: " + storeSales);
     
     
       } 

private static void XBOX(){
    
    Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the store: ");
     String storeName = scanner.nextLine();
     
     System.out.print("Enter the total sales of PS5 consoles for Number 1 Electronic Store: ");
     String storeSales = scanner.nextLine();
     
     System.out.println(" ");
     
     System.out.println("CONSOLE SALES REPORT");
     System.out.println("********************");
     System.out.println("CONSOLE TYPE: XBOX");
     System.out.println("Store: " + storeName);
     System.out.println("TOTAL SALES: " + storeSales);

}

private static void SWITCH(){
    
    Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter the store: ");
     String storeName = scanner.nextLine();
     
     System.out.print("Enter the total sales of PS5 consoles for Number 1 Electronic Store: ");
     String storeSales = scanner.nextLine();
     
     System.out.println(" ");
     
     System.out.println("CONSOLE SALES REPORT");
     System.out.println("********************");
     System.out.println("CONSOLE TYPE: SWITCH");
     System.out.println("Store: " + storeName);
     System.out.println("TOTAL SALES: " + storeSales);

}
        

        
