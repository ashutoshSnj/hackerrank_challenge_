package com.hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Day_20_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
      
      int flage=0;
      for(int i=0;i<a.size();i++){
    
        for(int j=i+1;j<a.size();j++){
            
            if(a.get(i)>a.get(j)){
                int temp=a.get(i);
                a.set(i, a.get(j));
                a.set(j,temp);  
                flage++;          }
        }
      }
      System.out.println("Array is sorted in "+flage+ " swaps.");
      System.out.println("First Element: "+a.get(0));
      System.out.println("Last Element: "+a.get(a.size()-1));
        bufferedReader.close();
    }
}
