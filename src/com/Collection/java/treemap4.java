package com.Collection.java;
import java.util.TreeMap;
//Search a Value in a tree map
public class treemap4 {
    public static void main(String[]args){
        TreeMap<String,String> tree_map=new TreeMap<String, String>();
        tree_map.put("1","Sumit");
        tree_map.put("2","Rahul");
        tree_map.put("3","Dhruv");
        tree_map.put("4","Arjun");
        tree_map.put("5","Keshav");
        tree_map.put("6","Abhishek");
        System.out.println(tree_map);
        if (tree_map.containsValue("Dhruv")){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
}}
