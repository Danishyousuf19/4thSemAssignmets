package com.danish.collectons;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Questions {
	public void twoSum(int arr[], int t, int n) {

		HashMap<Integer, Integer> idx = new HashMap<>();
		for (int i = 0; i < n; i++) {
			idx.put(arr[i], i);
		}
		for (int i = 0; i < n; i++) {
			int s = t - arr[i];
			if (idx.containsKey(s) && i != Integer.valueOf(idx.get(s))) {
				System.out.printf("(i,j) = (%d,%d)", i, idx.get(s));
				return;
			}
		}
		System.out.println("not found");
	}

	public void repeat(int a[]) {
		Set<Integer> s = new HashSet<>();
		for (int c : a) {
			if (!s.add(c)) {
				System.out.println("duplicate element : " + c);
				return;
			}
		}
		System.out.println("no duplicate found");
	}

	public void Unique(int a[]) {
		int x = 0;
		for (int c : a) {
			x ^= c;
		}
		System.out.println("Unique element : " + x);
	}

	public void atMostK(ArrayList<Integer> list, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : list) {
			if (map.getOrDefault(i, 0) == k) {
				System.out.print(i + " ");
			}
			map.put(i, map.getOrDefault(i, 0) + 1);

		}

	}

	public void KmostFreq(int arr[], int k) {
//		int arr[] = { 5, 2, 2, 3, 3, 4, 4 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		Queue<Map.Entry<Integer, Integer>> freq = new PriorityQueue<>((a, b) -> {
			return b.getValue() - a.getValue();
		});

		freq.addAll(map.entrySet());
		while (k > 0) {
			k--;
			System.out.print((freq.poll().getKey()) + " ");
		}

	}

	public void _3sum(int arr[], int t) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, t - i);

		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			for (int i : arr) {
				if (entry.getKey() + i == entry.getValue()) {
					System.out.println("elements = " + i + " " + entry.getKey() + " " + (entry.getValue() - i));
				}

			}
		}
		System.out.println("not found");
	}

	public void ThreeSum(int arr[], int k, int n) {
		Map<Integer, pair> map = new HashMap<>();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				map.put(arr[i] + arr[j], new pair(arr[i], arr[j]));

		for (int i = 0; i < n; i++) {
			pair ts = map.get(k - arr[i]);
			if (ts != null) {
				System.out.println(arr[i] + " " + ts.arr[0] + " " + ts.arr[1]);
			}
		}
	}

	public class pair {
		int arr[] = new int[2];

		pair(int a, int b) {
			arr[0] = a;
			arr[1] = b;
		}

	}

}
