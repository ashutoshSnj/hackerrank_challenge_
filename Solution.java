package com.start;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
        double ef = scan.nextDouble();
        scan.nextLine();
        String sd = scan.nextLine();
     System.out.println(i+a);
     System.out.println(d+ef);
   
     System.out.println(s.concat(sd));
      

        scan.close();
    }
}