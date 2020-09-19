package com.Collection.java;
import java.util.TreeMap;
//get a key vlue mapping associated with the greatest key less than or equal to the given key
public class treemap11 {
    public static void main(String[]args) {
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
        tree_map.put(1, "Sumit");
        tree_map.put(2, "Rahul");
        tree_map.put(3, "Dhruv");
        tree_map.put(4, "Arjun");
        tree_map.put(5, "Keshav");
        tree_map.put(6, "Abhishek");
        System.out.println(tree_map);
        System.out.println(tree_map.floorEntry(2));
        System.out.println(tree_map.floorEntry(4));
    }
}
