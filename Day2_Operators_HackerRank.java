package com.start;

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

class Result {

   

  public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double output=meal_cost/100;
           output=output*tip_percent;
           double finaltx=tax_percent*meal_cost/100;
         double  Ans=meal_cost+output+finaltx;
        int FinalOutput= (int) Math.round(Ans);
         
         System.out.println(FinalOutput);
    

    }

}

public class Day2_Operators_HackerRank {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
