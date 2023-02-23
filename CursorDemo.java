package com.collectionframeworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorDemo {
    public static void main(String[] args) {
         public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(55);
        ll.add(100);
        ll.add(76);
        ll.add(67);
        ll.add(10);
        // USING ITERATOR --> INTERFACE --> ONLY FORWARD DIRECTIONAL
        Iterator x = ll.iterator();
        System.out.println("PRINTING FIRST ELEMENT: " + x.next());
        System.out.println("looping using hasnext() ");
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
            //System.out.println(x.hashCode());
        }
        System.out.println();
        System.out.println("Removing Particular index position");
        while (x.hasNext()) {
            if (x.next().equals(76))
                x.remove();
        }
        /*//LIST ITERATOR --> BIDIRECTIONAL
        System.out.println(ll);
        ListIterator<Integer> y =ll.listIterator();
        while(y.hasNext()){
            if(y.next().equals(100)){
                y.remove();
            }
        }
        System.out.println(ll);
        y.set(10000);
        System.out.println(ll);
        while(y.hasPrevious()){
            if(y.previous().equals(10)){
                y.remove();
            }
        }
        System.out.println(ll);*/

    }


    }
}
