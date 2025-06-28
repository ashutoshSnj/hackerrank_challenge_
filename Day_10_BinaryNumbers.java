package com.hackerrank;


import java.io.*;

public class Day_10_BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

    
        String binary = Integer.toBinaryString(n);
        String[] groups = binary.split("0");
        int max = 0;
        for (String group : groups) {
            if (group.length() > max) {
                max = group.length();
            }
        }
        System.out.println(max);
    }
}
