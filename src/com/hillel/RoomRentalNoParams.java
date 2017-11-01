package com.hillel;

import java.util.Scanner;
    
public class RoomRentalNoParams {
    
    public static void main(String... args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введиет кол-во дней: ");
        int days = scanner.nextInt();
        
        System.out.print("Введиет цену за день: ");
        int price = scanner.nextInt();
        
        //int days = Integer.parseInt(args[0]);
        //int price = Integer.parseInt(args[1]);
        
        int totalPrice = days * price;
        
        if (days > 5 && days <= 7) {
            totalPrice -= 20;
        }
        
        if (days > 7) {
            totalPrice -= 50;
        }
        
        System.out.println("К оплате: " + totalPrice);
    }
}