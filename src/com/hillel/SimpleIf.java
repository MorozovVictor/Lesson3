package com.hillel;

public class SimpleIf {

    public static void main(String... args){
  
        byte a=5; //-128..127
        byte b=12;

        byte max = calculatedMaximum(a,b);
        
        System.out.println("Maximum: " + max);
  
        if (a>b){
            System.out.println("Maximum: " + a);
        } else {
            System.out.println("Maximum: " + b);
        }
        
        System.out.println("Maximum: " + (a > b ? a: b));
    }
    public static byte calculatedMaximum(byte a, byte b) {
        return a > b ? a : b;
    }

  

}