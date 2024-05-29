import java.util.Arrays;

public class QuickSort {

	static void quickSort(int arr[], int l, int h) {
		if (l < h) {
			int p = divide(arr, l, h);
			quickSort(arr, l, p - 1);
			quickSort(arr, p + 1, h);

		}
	}

	static int divide(int arr[], int l, int h) {
		int pivot = arr[h];
		int i = l;
		for (int j = l; j < h; j++) {
			if (arr[j] < pivot) {
				swap(arr, i++, j);
			}
		}
		swap(arr, i, h);
		return i;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 5, -2, 0, 3, 6,-7 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
