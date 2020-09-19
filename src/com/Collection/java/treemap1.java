package com.Collection.java;
import java.util.Map;
import java.util.TreeMap;
//Associate the specified value with the specified key in a TreeMap
public class treemap1 {
    public static void main(String args[]){
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        tree_map.put(1, "Sumit");
        tree_map.put(2, "Rahul");
        tree_map.put(3, "Dhruv");
        tree_map.put(4, "Abhi");
        tree_map.put(5, "Nirmal");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
