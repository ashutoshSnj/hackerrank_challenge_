package com.hackerrank;
import java.io.*;
import java.util.*;

public class Day6_LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=no;i++){
        StringBuffer str=new StringBuffer(sc.nextLine());
        StringBuffer even=new StringBuffer();
        StringBuffer odd=new StringBuffer();
        for(int j=0;j<str.length();j++){
            if(j%2==0){
                even.append(str.charAt(j));
            }
            else{
                odd.append(str.charAt(j));
            }
        }
        System.out.println(even+" "+odd);
    }
    
    
    
     
     }
}
