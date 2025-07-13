package com.hackerrank;


import java.io.*;
import java.util.*;


public class Day_25_Running_Time_and_Complexity {
 public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; 
        }
        if (n == 2) {
            return true; 
        }
        if (n % 2 == 0) {
            return false; 
        }
       
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    
    }
}