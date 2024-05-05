//Write a program to create an Animal class with member variables name,
// color, types (pet/wild). Override the hashCode method to print the
// unique id for the object. Create the objects of the Animal class and
// print its hashcode

import java.util.Objects;

public class Animal<T> {
	String name, color;
	T type;

//	enum String {
//		A, B, C
//	}

	Animal(T t, String a, String b) {
		name = a;
		color = b;
		type = t;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, type);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (o.getClass() != this.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Animal<T> a = (Animal<T>) o;
//		return Objects.equals(this.name, a.name) && Objects.equals(this.color, a.color)
//				&& Objects.equals(this.type, a.type);
		return a.hashCode() == this.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal<?> a=new Animal<>("a","b","c");
Animal<String> b=new Animal<>("a","b","c");
//System.out.println(a.hashCode());
System.out.println(a.equals(b));
	}

}
