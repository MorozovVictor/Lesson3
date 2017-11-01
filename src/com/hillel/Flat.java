package com.hillel;

public class Flat {
public static void main(String... args) {
    int days = args[0];
    int price = args[1];
    
    if (days > 5 && days <= 7) {
        System.out.println("Pay summ = " + ((price * days) - 20)));
    }
    if (days > 7) {
        System.out.println("Pay summ = " + ((price * days) - 50));
        } else { System.out.println("Pay summ = " + price); }
            }
    }
}
}