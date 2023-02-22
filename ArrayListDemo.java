package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {//PRIMITIVE
        System.out.println("\n ARRAYS \n");
        int[] arr=new int[]{10,20,3,45,0,49};
        System.out.println("Primitive Array Sorting - Before: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Primitive Array Sorting - After: "+Arrays.toString(arr));
        System.out.println("----------------------------------------------------------------------");
        String [] x={"Saravana","Lithu","Ambi","Lavu","Surya"};// NON PRIMITIVE
        System.out.println("Non-Primitive Array Sorting - Before: ");
        for(String names:x){
           System.out.print(names + " ");
       }
        Arrays.sort(x);
        System.out.println();
        System.out.println("Non-Primitive Array Sorting - After: ");
        for(String names:x){
            System.out.print(names + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        //DYNAMIC BINDING
        /*Comparator c=new ComparatorDemo();
        Arrays.sort(x,c);
        for(String names:x){
            System.out.println(names + " ");
        }*/

        System.out.println("\n ARRAYLIST \n");
        ArrayList al=new ArrayList(); // ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add("hello");
        al.add(23.2f);
        System.out.println("VALUES: "+al);
        al.add(1,'A');
        System.out.println("ADDED VALUES: "+al);
        System.out.println("SIZE: "+al.size());
        System.out.println("CONTAINS \"A\" OR NOT :"+al.contains('A'));
        System.out.println("REMOVE \"HELLO\": "+al.remove("hello"));
        System.out.println("ADD HELLO: "+al.add("hello"));
        System.out.println("UPDATED VALUES: "+al);
        System.out.println("GET 3RD INDEX:"+al.get(3));
        System.out.println("REMOVE HELLO: "+al.remove("hello"));
        System.out.println("UPDATED VALUES: "+al);
        System.out.println("SET: "+al.set(1,"hey"));
        System.out.println("INDEX OF: "+al.indexOf("hey"));
        al.add(2,"hi guys");
        System.out.println("UPDATED VALUES: "+al);
        al.set(1,"Ambika");
        System.out.println("AFTER UPDATE, VALUES: "+al);
        ArrayList al1=new ArrayList();
        al1.addAll(al);
        System.out.println("COPY ARRAYLIST TO ANOTHER : "+al1);

    }
}