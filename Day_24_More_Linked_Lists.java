package com.hackerrank;

import java.io.*;
import java.util.*;

class Nodee1 {
    int data;
    Nodee1 next;

    Nodee1(int d) {
        data = d;
        next = null;
    }
}

public class Day_24_More_Linked_Lists {

    public static Nodee1 removeDuplicates(Nodee1 head) {
        Nodee1 current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static Nodee1 insert(Nodee1 head, int data) {
        Nodee1 newNode = new Nodee1(data);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            Nodee1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static void display(Nodee1 head) {
        Nodee1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nodee1 head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
    }
}
