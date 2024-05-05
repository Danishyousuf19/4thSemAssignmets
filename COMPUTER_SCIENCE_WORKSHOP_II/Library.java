import java.util.HashMap;
import java.util.Objects;

class NewBook {
	private int id;
	private String name, auther;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "NewBook [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(auther, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewBook other = (NewBook) obj;
		return Objects.equals(name, other.name);
	}

}

public class Library {
	HashMap<Integer, NewBook> map;

	Library() {
		map = new HashMap<>();
	}

	public boolean present(NewBook b) {
		for (NewBook s : map.values()) {
			if (b.equals(s))
				return true;
		}
		return false;
	}

	@SuppressWarnings("unlikely-arg-type")
	public boolean remove(NewBook a) {
		for (NewBook b : map.values()) {
			if (a.hashCode() == b.hashCode()) {
				map.remove(a);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
