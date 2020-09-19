package com.Collection.java;
import java.util.*;
// Sort keys in Tree map by using comparator
public class treemap7 {
    public static void main(String args[]){
        TreeMap<String,String> tree_map = new TreeMap<String,String>(new sort_key());
        // Put elements to the map
        tree_map.put("1", "Sumit");
        tree_map.put("2", "Rahul");
        tree_map.put("3", "Dhruv");
        tree_map.put("4", "Arjun");
        tree_map.put("5", "Keshav");
        tree_map.put("6", "Abhishek");
        System.out.println(tree_map);
    }
}
class sort_key implements Comparator<String>{
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}