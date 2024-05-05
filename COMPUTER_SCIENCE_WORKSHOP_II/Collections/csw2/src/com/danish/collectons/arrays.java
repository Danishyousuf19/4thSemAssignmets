package com.danish.collectons;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class arrays {
	public void methods() {
		int arr[] = { 1, 4, 6, 8, 9, 12, 34, 5 };
		int brr[] = { 1, 4, 6, 8, 9, 12, 34, -34 };
		System.out.println(Arrays.binarySearch(arr, 35));
		for (int i : arr) {
			System.out.print(i + " ");
		}
		int g[] = { 13, 22, 16, 1, 1 }, h[] = { 13, 22, 16, 1 };
		System.out.println("\ncompare g f : " + Arrays.compare(g, h));
		System.out.println("\n" + Arrays.toString(arr));
		System.out.println("compare " + Arrays.compare(arr, brr));
		System.out.println(Arrays.compare(arr, 0, 5, brr, 0, 5));
		int crr[] = Arrays.copyOf(brr, 4);
		crr = Arrays.copyOfRange(brr, 3, 7);
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 4, 6));
		System.out.println(a.toString());
		System.out.println(Arrays.toString(crr));
		Integer drr[] = { 1, 4, 53, 2 };
		Arrays.sort(drr, Collections.reverseOrder());
		Arrays.sort(drr, (d, b) -> b - d);
		System.out.println(Arrays.toString(drr));
		System.out.println("compare " + Arrays.compareUnsigned(arr, brr));
		System.out.println(Arrays.mismatch(arr, brr));
		Arrays.fill(crr, -99);
		int p[][] = { { 2, 4, 5 }, { 2, 5, 6 } };
		System.out.println(Arrays.deepToString(p));
		IntBinaryOperator sum = (x, y) -> x + y;
		Arrays.parallelPrefix(arr, sum);
		System.out.println(Arrays.toString(arr));
		int krr[] = { 1, 6, 0, 2, 9, 4 };
		int frr[] = { 1, 6, 0, 88, 9, 4 };
		Arrays.parallelSort(krr);
//		System.out.println(Arrays.toString(krr));
		Arrays.parallelSort(frr, 0, 4);
		System.out.println(Arrays.toString(frr));
		Arrays.setAll(frr, i -> i + i);
		System.out.println(Arrays.toString(frr));
		
	}
}
