package com.hackerrank;



import java.util.*;
import java.io.*;

class Day_8_Dictionaries_and_Maps{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      HashMap<String,Integer> map=new HashMap<>();
      for(int i = 0; i < n; i++){
          String name = in.next().toLowerCase();
          Integer phone = in.nextInt();
          map.put(name,phone);
          
      }
      
      while(in.hasNext()){
          String s = in.next().toLowerCase();
        /* Optional<Map.Entry<String,Integer>> opt=map.entrySet().stream().filter(ref->ref.getKey().equals(s)).findFirst();
         if(opt.isPresent()){
       Map.Entry<String,Integer> ent=opt.get();
        System.out.println(ent.getKey()+"="+ent.getValue());
         }
         else{
          System.out.println("Not found");
         }*/
         if(map.containsKey(s)){
              System.out.println(s+"="+map.get(s));
         }
         else{
          System.out.println("Not found");
         }
      }
      in.close();
  }
}
