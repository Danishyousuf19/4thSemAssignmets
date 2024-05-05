import java.util.ArrayList;
import java.util.Comparator;

class Cars implements Comparable<Cars> {
	private String name;
	private int modelNo, stock;

	Cars(String a, int b, int c) {
		name = a;
		modelNo = b;
		stock = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Cars [name=" + name + ", modelNo=" + modelNo + ", stock=" + stock + "]";
	}

	@Override
	public int compareTo(Cars c) {
		return this.stock - c.stock;

	}

}

public class CarApp {
	static ArrayList<Cars> Sort(ArrayList<Cars> list) {
		for (int i = 0; i < list.size(); i++) {
			Cars t = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				Cars p = list.get(j);
				if (t.compareTo(p) < 0) {
					swap(list, i, j);
				}
			}
		}
		return list;

	}

	static void swap(ArrayList<Cars> l, int i, int j) {
		Cars temp = l.get(i);
		l.set(i, l.get(j));
		l.set(j, temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cars> list = new ArrayList<>();
		list.add(new Cars("Bmw", 13, 222));
		list.add(new Cars("polo", 12, 67));
		list.add(new Cars("benz", 17, 98));
		list.add(new Cars("MG", 15, 45));
//		list = Sort(list);
		list.sort(new Comparator<Cars>() {

			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.getStock() - o2.getStock();
			}

		});
		System.out.println(list.toString());
	}

}
