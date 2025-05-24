package com.Array;

public class CheckOrder {
      public static void main(String[] args) {
		int [] arr=new int [] {1,1,5,9,78};
		boolean result=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				result=false;
			}
		}
		if(result) {
			System.out.println("Array is an assesnding order");
			
		}
		else {
		System.out.println("Array is an not asseanding order");
		}
	}
}
