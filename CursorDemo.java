package com.collectionframeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("hi");
        l.add(1);
        l.add('a');
        System.out.println("Before Insertion: " + l);
        ListIterator o = l.listIterator();
        while (o.hasNext()) {
            if (o.next().equals(1))
                o.set("Ambika");
            //System.out.println(x.next());
            //x.remove();
        }
        System.out.println("After Insertion: " + l);
        Iterator x = l.iterator();
        while (x.hasNext()) {
            if (x.next().equals(1))
                x.remove();
            //System.out.println(x.next());
            //x.remove();
        }
        /*System.out.println(l);
        for (Object newNames : l){
            System.out.println(newNames);
        }
        LinkedList<String> str=new LinkedList<String>();
        str.add("hello");
        str.add("hi");
        str.add("welcome");
        System.out.println(str);
        for(String output : str){
            System.out.println(output);
        }*/

    }
}
