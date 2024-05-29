
public class CountingInversion {
	static int divide(int arr[], int l, int h) {
		int c = 0;
		if (l < h) {
			int m = (l + h) / 2;
			c += divide(arr, l, m);
			c += divide(arr, m + 1, h);
			c += count(arr, l, m, h);
		}
		return c;
	}

	static int count(int[] arr, int l, int m, int h) {
		int swaps = 0;
		int left[] = new int[m - l + 1];
		int right[] = new int[h - m];
		int l_ = l;
		for (int p = 0; p < m - l + 1; p++) {
			left[p] = arr[l_++];
		}
		int m_ = m + 1;
		for (int p = 0; p < h - m; p++) {
			right[p] = arr[m_++];
		}
		int k = l;
		int i = 0, j = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
				swaps += (m + 1) - (i + l);
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
		return swaps;
	}

	static int greedy(int arr[], int n) {
		int s = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					s++;
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 5, -2, 0, 3, 6, -7 };
		System.out.println(greedy(arr, arr.length));
		System.out.println(divide(arr, 0, arr.length - 1));
	}

}
