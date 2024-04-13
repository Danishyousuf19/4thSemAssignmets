package com.danish.collectons;

import java.util.*;

public class hashMap {
	void map() {
		Map<Integer, String> mp = new HashMap<>();
		for (int i = 1; i <= 5; i++) {
			mp.put(i, "Value = " + (i * 13 + 73) % 5);
		}
		for (Integer i : mp.keySet()) {
			System.out.println(" key = " + i);
		}
		for (String i : mp.values()) {
			System.out.println(i);
		}
		mp.put(9, mp.getOrDefault(9, " Value = Good bye"));
		mp.putIfAbsent(6, "I was absent");
		HashMap<Integer, String> addme = new HashMap<>();
		addme.put(7, "I am different");
		addme.put(8, "I am different");
		mp.putAll(addme);
		mp.replace(7, "I was changed");
		mp.replace(5, "Value = 3", "Value was 3");
		for (Map.Entry<Integer, String> entry : mp.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " " + entry.getValue());
		}
		System.out.println(mp.size());
		System.out.println(mp.get(2));
		System.out.println(mp.getOrDefault(3, "I am here"));
		System.out.println(mp.containsKey(3));
		System.out.println(mp.containsValue("Value was 3"));
//		mp.clear();
		System.out.println(mp.isEmpty());
		int arr[]= {1,1,2,4,5,5,6,6,6,7};
		mp.forEach((key, value) -> {
		    System.out.println("Key : " + key + ", Value : " + value);
		});

		System.out.println("calculating freq");
		calFreq(arr);
	}
	void calFreq(int arr[]) {
		HashMap<Integer,Integer> freq=new HashMap<>();
		for ( int i :arr) {
			freq.put(i, freq.getOrDefault(i, 0)+1);
		}
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			System.out.println("Key = " + entry.getKey() + " Freq = " + entry.getValue());
		}
		
	}
}
