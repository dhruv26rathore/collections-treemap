package com.Collection.java;

import java.util.TreeMap;

//Delete all elements
public class treemap6 {
    public static void main(String[]args) {
        TreeMap<String, String> tree_map = new TreeMap<String, String>();
        tree_map.put("1", "Sumit");
        tree_map.put("2", "Rahul");
        tree_map.put("3", "Dhruv");
        tree_map.put("4", "Arjun");
        tree_map.put("5", "Keshav");
        tree_map.put("6", "Abhishek");
        System.out.println(tree_map);
        tree_map.clear();
        System.out.println(tree_map);
}
}
