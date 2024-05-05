
// Write a program to create a Student class with members name, rn, and
// total mark. Create an array of student objects and sort it using Bubble
// sort according to its rn.
// Note: Overload compareTo method of Comparable interface.
import java.util.ArrayList;

public class SortStudent implements Comparable<SortStudent> {
	int rn;
	String name;
	int mark;

	SortStudent(int a, String b, int c) {
		rn = a;
		name = b;
		mark = c;
	}

	@Override
	public int compareTo(SortStudent o) {
		// TODO Auto-generated method stub
		return this.rn - o.rn;
	}

	static void sort(ArrayList<SortStudent> list) {
		for (int i = 0; i < list.size(); i++) {
			SortStudent cur = list.get(i);
			for (int j = 0; j < list.size() ; j++) {
				if (cur.compareTo(list.get(j)) < 0) {
					swap(list, i, j);
				} else {
					continue;
				}

			}
		}
		print(list);

	}

	static void swap(ArrayList<SortStudent> list, int i, int j) {
		SortStudent temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	static void print(ArrayList<SortStudent> list) {
		for (SortStudent s : list) {
			System.out.println(s.toString());
		}
	}
	@Override
	public String toString() {
		return "SortStudent [rn=" + rn + ", name=" + name + ", mark=" + mark + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<SortStudent> list = new ArrayList<>();
				list.add(new SortStudent(12, "danish", 82));
				list.add(new SortStudent(2, "xyz", 44));
				list.add(new SortStudent(3, "abc", 99));
				@SuppressWarnings("unused")
				SortStudent k = new SortStudent(1, "danish", 82);
				sort(list);
			
	}

}
