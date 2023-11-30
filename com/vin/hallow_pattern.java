package com.vin;
import java.util.Scanner;

public class hallow_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter input of n");
        int n = sc.nextInt();
        System.out.println("Enter input of m");
        int m = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (row == 1 || row == n || col == 1 || col == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                       }
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close(); // Close the scanner
    }
}
