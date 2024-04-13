
//Write a program to create a Student class with members name, rn, and
// totalMark. Create an array of student objects and search a student object
// using linear search from the array.
// Note: Overload compareTo method of Comparable interface.
import java.util.ArrayList;

public class Student implements Comparable<Student> {
	int rn;
	String name;
	int mark;

	Student(int a, String b, int c) {
		rn = a;
		name = b;
		mark = c;
	}

	static void print(ArrayList<Student> list) {
		for (Student s : list) {
			System.out.println(s.toString());
		}
	}

	static void search(ArrayList<Student> list, Student t) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(t)) {
				System.out.println("Yes found");
				return;
			}
		}
		System.out.println("not found");
	}

	public boolean equals(Object a) {
		if (this == a)
			return true;
		if (a.getClass() != this.getClass())
			return false;
		Student s = (Student) a;
		return this.rn == s.rn && this.name.equals(s.name) && this.mark == s.mark;
	}

	@Override
	public int compareTo(Student o) {
		return this.rn - o.rn;
	}

	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", mark=" + mark + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "danish", 82));
		list.add(new Student(2, "xyz", 44));
		list.add(new Student(3, "abc", 99));
		Student k = new Student(1, "danish", 82);
		search(list, k);
	}

}
