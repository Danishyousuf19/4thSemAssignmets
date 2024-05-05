import java.util.LinkedList;
import java.util.Objects;

class NewStudent {
	private int mark, age;
	private String name;

	NewStudent(String a, int b, int c) {

		name = a;
		mark = b;
		age = c;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewStudent other = (NewStudent) obj;
		return age == other.age && mark == other.mark && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "NewStudent_Admin [mark=" + mark + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, mark, name);
	}
}

public class Admin {
	LinkedList<NewStudent> list;

	Admin() {
		list = new LinkedList<NewStudent>();
	}

	public void display() {
		for (NewStudent s : list) {
			System.out.println(s.toString());
		}
	}

	public void add(NewStudent a) {
		list.add(a);
	}

	public boolean search(NewStudent b) {
		for (NewStudent a : list) {
			if (b.equals(a)) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return list.size();
	}

	public boolean remove(NewStudent a) {

		for (NewStudent s:list){
			if(s.hashCode()==a.hashCode()) {
				list.remove(a);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		a.add(new NewStudent("suzain", 20, 88));
		a.add(new NewStudent("suzain", 20, 88));
		a.add(new NewStudent("yasir", 18, 98));
		a.display();
		System.out.println(a.remove( new NewStudent("suzain", 20, 88)));
		System.out.println(a.search(new NewStudent("suzain", 20, 88)));
		a.display();
	}

}
