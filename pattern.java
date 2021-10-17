package com.company;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {

        // 1st pyramid shape or triangle

        //Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int n = 5;
        System.out.println("Trianlge");
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 2nd next diamond shape
        System.out.println("Diamond");
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // 3rd normal triangle with reverse
        System.out.println("normal reverse triangle");
        for( int i = n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

  // 4 reverse triangle
        System.out.println("reverse triangle");
        for( int i = n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

// 5 downward triangle star pattern
        System.out.println("downward trianlge star pattern");
        for( int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
// 6 right pascal's triangle

        System.out.println("right pascal's triangle");
        for( int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for( int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
// Left pascal's pattern
        System.out.println("Left pascal's pattern");
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Sandglass star pattern
        System.out.println("Sandglass star pattern ");

        for( int i = n; i>=1; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // empty triangle
        System.out.println("empty triangle ");
        for(int i = 1; i<=n; i++){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                if(k == 1 || i == n || k == (2*i-1)){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }

        // Reverse empty triangle
        System.out.println("Reverse empty triangle ");
        for(int i = n; i>=1; i--){
            for(int j = n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i-1); k++){
                if(k == 1 || i == n || k == (2*i-1)){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }


            System.out.println();
        }

        //

    }
}
