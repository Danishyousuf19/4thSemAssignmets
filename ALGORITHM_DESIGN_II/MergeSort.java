import java.util.Arrays;

public class MergeSort {
	static void merge(int arr[], int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			merge(arr, l, m);
			merge(arr, m + 1, h);
			sort(arr, l, m, h);
		}
	}

	static void sort(int arr[], int l, int m, int h) {
		int left[] = new int[m - l + 1];
		int right[] = new int[h - m];
		int l_ = l;
		for (int o = 0; o < m - l+1 ; o++) {
			left[o] = arr[l_++];
		}
		int m_ = m+1;
		for (int o = 0; o < h - m; o++) {
			right[o] = arr[m_++];
		}
		int i = 0, j = 0, k = l;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 2, 0, 3, 6,7 };
		merge(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
