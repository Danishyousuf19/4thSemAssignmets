
public class SearchIn2d {
	static boolean search(int arr[][], int t) {
		int m = arr.length - 1;
		int n = arr[0].length;
		for (int i = 0; i < n; i++) {
			if (arr[i][0] <= t && arr[i][m] >= t) {
				return BinarySearch(arr, i, t, m);
			}

		}
		return false;
	}

	static boolean SearchOptimized(int arr[][], int t) {
		int m = arr.length - 1;
		int i = 0;
		int j = m ;
		while (i < j) {
			int mid = (i + j) / 2;
			if (arr[mid][0] <= t && arr[mid][m] >= t) {
				return BinarySearch(arr, mid, t, m);
			} else if (arr[mid][0] > t)
				i = mid - 1;

			else
				j = mid + 1;

		}
		return false;

	}

	static boolean BinarySearch(int arr[][], int i, int t, int j) {
		int m = 0;
		int i_ = 0;
		while (i_ <= j) {
			m = (i_ + j) / 2;
			if (arr[i][m] == t)
				return true;
			else if (arr[i][m] > t) {
				j = m - 1;
			} else
				i_ = m + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr[] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(SearchOptimized(arr, 8));
	}

}
