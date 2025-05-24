package com.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charCount {
 /* public static void main(String[] args) {
	System.out.println("Enter the String  = ");
	 Scanner sc=new Scanner (System.in);
	// StringBuilder str=new StringBuilder(sc.nextLine());
	 String str=sc.nextLine();
	
	char[] arr=str.toCharArray();
	boolean [] arc=new boolean[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(arc[i]) {
		continue;	
		}
	     int count =1;
	    // int len=arr.length;
	     
		for(int j=i+1;j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
			  count++;
			  arc[j]=true;
		  }
		  if(j==arr.length-1) {
			  System.out.println(arr[i]+" char present in = "+count+" times");
		  }
		}
	}
}  */ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // Line 1
    System.out.print("Enter the string: ");  // Line 2
    String str = sc.nextLine();  // Line 3

    Map<Character, Integer> freqMap = new HashMap<>();  // Line 4

    for (char ch : str.toCharArray()) {  // Line 5
        if (freqMap.containsKey(ch)) {   // Line 6
            freqMap.put(ch, freqMap.get(ch) + 1);  // Line 7
        } else {
            freqMap.put(ch, 1);  // Line 9
        }
    }

    for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {  // Line 11
        System.out.println(entry.getKey() + " = " + entry.getValue());  // Line 12
    }
}
}
