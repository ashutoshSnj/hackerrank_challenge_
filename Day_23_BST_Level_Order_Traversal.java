package com.hackerrank;


import java.util.*;
import java.io.*;

class Nodee{
    Nodee left,right;
    int data;
    Nodee(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day_23_BST_Level_Order_Traversal{

static void levelOrder(Nodee root){
    if (root == null) return;

    Queue<Nodee> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Nodee current = queue.poll(); 
        System.out.print(current.data + " ");

        if (current.left != null)
            queue.add(current.left);
        if (current.right != null)
            queue.add(current.right);
    }
}

public static Nodee insert(Nodee root,int data){
        if(root==null){
            return new Nodee(data);
        }
        else{
            Nodee cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Nodee root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}