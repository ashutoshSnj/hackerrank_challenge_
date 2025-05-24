package com.Array;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		StringBuilder str=new StringBuilder (sc.nextLine());
		int size=str.length()-1;
		int flag=0;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(size)) {
				flag=1;
				break;
			}
		   size--;
		}
		if(flag==1) {
			System.out.println("string is not palindrom");
		}
		else {
			System.out.println("String is palindrom");
		}
	}
}
