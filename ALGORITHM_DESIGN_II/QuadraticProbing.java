public class QuadraticProbing {
	static int arr[];
	static int n;

	@SuppressWarnings("static-access")
	QuadraticProbing(int n) {
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
		int j=1;
		while (arr[(p+j*j)%n] != -999) {
			p++;j++;
		}
		arr[(p+j*j)%n] = i;
	}

	static void printArray() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QuadraticProbing l = new QuadraticProbing(10);
		int arr[] = { 11, 33,24, 23 };
		l.add(arr);
//		output -999 11 -999 33 24 -999 -999 -999 23 -999 -999 
	}
}
