package com.vin;

public class pattern {
    public static void main(String[] args){
    pattern1(5);    
    }

    static void pattern1(int n) {
       for (int Row= 1; Row <= n; Row++) {
        for (int col = 1; col<= Row; col++) {

            System.out.print("* ");
        
       } 
            System.out.println(" ");
       } 

    }
}
