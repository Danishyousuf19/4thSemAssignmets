import java.util.LinkedList;

public class Chaining {
	LinkedList<Integer>[] chain;
	@SuppressWarnings("unchecked")
	Chaining() {
		chain = new LinkedList[10];
		for (int i = 0; i < 10; i++) {
			chain[i] = new LinkedList<>();
		}
	}

	 void add(int keys[]) {
		for (int i : keys) {
			chain[i % 10].add(i);
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(chain[i].toString());
		}
	}

	public static void main(String[] args) {
		Chaining chaining = new Chaining();
		int arr[] = { 11, 33, 61, 34,66,98,67,27,20,23 };
		chaining.add(arr);
	}
}
