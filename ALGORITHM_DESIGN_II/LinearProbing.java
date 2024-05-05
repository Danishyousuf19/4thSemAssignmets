public class LinearProbing {
	static int arr[];
	static int n;

	@SuppressWarnings("static-access")
	LinearProbing(int n) {
		this.n = n;
		arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = -999;
		}
	}

	void add(int keys[]) {
		for (int i : keys) {
			if (arr[i % n] != -999) {
				fit(i, i % n);
			} else {
				arr[i % n] = i;
			}
		}
		printArray();
	}

	static void fit(int i, int p) {
		while (arr[p % n] != -999) {
			p++;
		}
		arr[p] = i;
	}

	static void printArray() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinearProbing l = new LinearProbing(10);
		int arr[] = { 11, 33,24, 23 ,43,43,53,65};
		l.add(arr);
	}
}
