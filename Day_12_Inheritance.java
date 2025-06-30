package com.hackerrank;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    Student(String FName,String LName,int id,int[] score){
        super(FName,LName,id);
        this.testScores=score;
    }
    
    public char calculate(){
        int num=0;
        for(int num1:this.testScores){
            num=num1+num;
        }
        int result=num/this.testScores.length;
        if(90<=result && result<=100){
            return 'O';
        }
        else if(80<= result &&90>result){
            return 'E';
        }
         else if(70<= result &&80>result){
            return 'A';
        }
        else if(55<= result &&70>result){
            return 'P';
        }
         else if(40<= result &&55>result){
            return 'D';
        }
         else {
            return 'T';
        }
    }
    
}

class Day_12_Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}