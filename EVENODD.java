package com.Array;

public class EVENODD {
   public static void main(String[] args) {
	//int [] arr=new int[8];
	int [] rrr=new int[] {4,85,985,85,85,85,85,874};
	boolean [] bol=new boolean[rrr.length];
	System.out.println("This is sum no = ");
	for(int i=0;i<rrr.length;i++) {
		if(rrr[i]%2==0) {
			System.out.println(rrr[i]);
			bol[i]=true;
		}
	}
	System.out.println("this is even no = ");
	for(int i=0;i<rrr.length;i++) {
		if(bol[i]) {
		continue;
		}
		System.out.println(rrr[i]);
	}
}
   
}
