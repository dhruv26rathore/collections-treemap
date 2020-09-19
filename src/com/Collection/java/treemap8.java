package com.Collection.java;

import java.util.TreeMap;

// get a key-value associate with the first key and the last key in a map
public class treemap8 {
    public static void main(String[]args) {
        TreeMap<String, String> tree_map = new TreeMap<String, String>();
        tree_map.put("1", "Sumit");
        tree_map.put("2", "Rahul");
        tree_map.put("3", "Dhruv");
        tree_map.put("4", "Arjun");
        tree_map.put("5", "Keshav");
        tree_map.put("6", "Abhishek");
        System.out.println(tree_map);
        System.out.println(tree_map.firstEntry());
        System.out.println(tree_map.lastEntry());
    }
}
