package com.collectionframeworks;

import java.util.*;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Ambika", 1);
        hm.put("Lithu", 2);
        hm.put("surya", 3);
        hm.put("saara", 4);
        System.out.println("Hashmap elements: " + hm);
        System.out.println("get method: " + hm.get("Ambika"));
        System.out.println("keyset: " + hm.keySet());
        System.out.println("size: " + hm.size());
        System.out.println("Clone elements: " + hm.clone());
        /*System.out.println("Remove Ambika: "+hm.remove("Ambika"));
        System.out.println("Remove Lithu: "+hm.remove("Lithu", 2));
        System.out.println(hm);*/
        System.out.println("Is empty: " + hm.isEmpty());
        System.out.println("Keys are : " + hm.keySet());
        System.out.println("Values are : " + hm.values());
        System.out.println("Entries are : " + hm.entrySet());
        /*Set s1=hm.entrySet();
        Iterator i = s1.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(i.next());
        }*/
        /*System.out.println("---------------------------------------");
        LinkedHashMap lhm=new LinkedHashMap();
        lhm.put("Ambika",20);
        lhm.put("Lavu",40);
        lhm.put("Saara",70);
        lhm.put("Lithu",10);
        lhm.put("Surya",15);
        System.out.println(lhm);
        System.out.println(lhm.containsValue(10));
        System.out.println(lhm.containsValue("Lithu"));
        System.out.println(lhm.getOrDefault("Surya",1));
        Set s=lhm.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()){

         //     Map.Entry me =(Map.Entry) i.next();
            System.out.println(i.next());
        }
*/
        System.out.println("--------------------------------------------------------");
        TreeMap tm = new TreeMap();
        tm.put(80, "hi");
        tm.put(50, "hello");
        System.out.println(tm);
        TreeMap tm1 = new TreeMap(tm);
        System.out.println(tm1);
    }

}
