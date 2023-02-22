package com.collectionframeworks;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println("LINKEDLIST ELEMENTS: ");
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
        ll.add(2,90);
        System.out.println("ADD ELEMENT: "+ll);
        System.out.println("SIZE: "+ll.size());
        Object[] output=ll.toArray();
        System.out.println("USING OBJECT ARRAY: ");
        for (Object o :output){
            System.out.print(o+" ");
        }

    }
}
