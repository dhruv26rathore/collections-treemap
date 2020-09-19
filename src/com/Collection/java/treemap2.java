package com.Collection.java;
import java.util.TreeMap;
//copy a tree map contain to another tree map
public class treemap2 {
    public static void main(String args[]){
        TreeMap<String,String> tree_map=new TreeMap<String, String>();
        tree_map.put("1","Sumit");
        tree_map.put("2","Rahul");
        tree_map.put("3","Dhruv");
        tree_map.put("4","Arjun");
        tree_map.put("5","Keshav");
        tree_map.put("6","Abhishek");
        System.out.println(tree_map);
        TreeMap<String,String> tree_map2=new TreeMap<String, String>();
        tree_map2.put("7","Abhay");
        tree_map2.put("8","Nilesh");
        tree_map.putAll(tree_map2);
        System.out.println(tree_map);
    }
}
