import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

class User implements Comparable<User> {
	User(String s, int n) {
		name = s;
		rn = n;
	}

	private String name;
	private int rn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", rn=" + rn + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.rn - o.rn;
	}
}

public class ArrayListUser {
	static ArrayList<User> Sort(ArrayList<User> list) {
		for (int i = 0; i < list.size(); i++) {
			User t = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				User p = list.get(j);
				if (t.getRn() < p.getRn()) {
					swap(list, i, j);
				}

			}
		}
		return list;

	}

	static void swap(ArrayList<User> l, int i, int j) {
		User temp = l.get(i);
		l.set(i, l.get(j));
		l.set(j, temp);
	}

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("danish", 13));
		list.add(new User("arpan", 12));
		list.add(new User("aayush", 17));
		list.add(new User("yasir", 15));
//		list = Sort(list);
		Collections.sort(list);
		System.out.println(list.toString());
	}

}
