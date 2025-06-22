package com.start;


import java.io.*;
import java.util.*;

public class Day_4_Class_vs_Instance {
    private int age;	
  
	public Day_4_Class_vs_Instance(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge>0){
      this.age=initialAge;        
        }
        else{
           System.out.println("Age is not valid, setting age to 0."); 
           this.age=0;
        }
    
	}

	public void amIOld() {
        if(this.age<13){
            System.out.println("You are young.");
        }
         else if(this.age>=13 && age<18) {
            System.out.println("You are a teenager.");
         }
        else{
            System.out.println("You are old.");
        }
  		
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age=this.age+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day_4_Class_vs_Instance p = new Day_4_Class_vs_Instance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}