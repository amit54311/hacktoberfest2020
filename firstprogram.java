package com.company.whileLoop;

import java.util.Scanner;

public class Pallindrome
{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ReversedNumber = 0;

        int temp = n;

        while (temp>0){
            int lastNumber = temp % 10;
            ReversedNumber = ReversedNumber * 10 + lastNumber;
            temp /= 10;

        }
        if(ReversedNumber == n){
            System.out.println("number is palllindrome ");
        }
        else
        {
            System.out.println("number is not pallindrome ");
        }
    }
}
