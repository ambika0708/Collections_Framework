package com.collectionframeworks;



import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet(); /*Insertion order not maintained, duplicates not allowed*/
        hs.add("a");
        hs.add("b");
        hs.add(10);
        hs.add(4.4);
        hs.add(10);
        hs.add(5);
        hs.add('d');
        System.out.println("Hashset: "+hs);
        LinkedHashSet lhs = new LinkedHashSet(); /*Insertion order is maintained, duplicates not allowed*/
        lhs.add("a");
        lhs.add("b");
        lhs.add(10);
        lhs.add(4.4);
        lhs.add(10);
        lhs.add(10);
        lhs.add(5);
        lhs.add('d');
        System.out.println("LinkedHashset: "+lhs);
        TreeSet ts = new TreeSet(); // print output in sorted Manner, duplicates not allowed
        /*ts.add("a");
        ts.add("d");
        ts.add("b");*/
        ts.add(10);
        ts.add(10);
        ts.add(40);
        ts.add(55);
        ts.add(5);
        System.out.println("Treeset: "+ts);

    }
}
