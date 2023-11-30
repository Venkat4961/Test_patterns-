package com.vin;
//import java.util.Scanner;
public class pattern2 { 
    public static void main(String[] args){
        pattern4(4,5);
        pattern3(4);
        pattern5(5);
        pattern6(6);
        pattern7(5);
        pattern8(5);
        pattern9(5,1);
        pattern10(5);

    }
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row+1; col++){

                System.out.print("*");
            }
            System.out.println(" ");
        }

    }


    
    static void pattern4(int n, int m) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (row == 1 || row == n || col == 1 || col == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=n; row>=1; row--){
            for(int col=1;col<=row; col++){

                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
    static void pattern6(int n){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row; col++){

                System.out.print(" ");
            }
            for(int col=1;col<=row; col++){

                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=row; col++){

                System.out.print(col+" ");
            }   
            System.out.println();
        }
    }
    
    static void pattern8(int n){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=n-row; col++){

                System.out.print(col+" ");
            }   
            System.out.println();
        }
    }
    static void pattern9(int n,int num){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=row; col++){
                System.out.print(num+" ");
                num++;
            }   
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row=1; row<=n; row++){
            for(int col=1;col<=row; col++){
                int sum =row+col;
                if(sum % 2 ==0){
                  System.out.print("1 ");  
                }else{
                  System.out.print("0 ");
                }
                
            }   
            System.out.println();
        }
    }


    
}
                 

