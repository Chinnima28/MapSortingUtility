package com.example.utils;

import java.util.*;

public class MapSorter {
    // Method to sort the map by value in ascending order
    public static Map<String, Integer> sortByValueAscending(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    // Method to sort the map by value in descending order
    public static Map<String, Integer> sortByValueDescending(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    // Method to sort the map by key lexicographically
    public static Map<String, Integer> sortByKey(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        return sortedMap;
    }
}
