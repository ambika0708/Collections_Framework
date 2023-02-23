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
        //LINKEDLIST SPECIFIC METHODS
        ll.addFirst("A");
        ll.addLast("Z");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.poll();
        System.out.println(ll);
        ll.pollLast();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.offer("1000");
        System.out.println(ll);
        ll.offerLast(200);
        System.out.println(ll);
        ll.offerFirst(200);
        System.out.println(ll);


    }
}
