
class Car implements Comparable<Car> {
	String modal;
	int speed;
	String color;

	public Car(String a, int b, String c) {
		modal = a;
		speed = b;
		color = c;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub

		return this.speed - o.speed;
	}

	public void details(Car o) {
		if (this.compareTo(o) == 0) {
			System.out.println("both have equal speed");
		} else if (this.compareTo(o) < 0) {
			System.out.println(o.toString());
		} else {
			System.out.println(this.toString());
		}
	}

	@Override
	public String toString() {
		return "Car [modal=" + modal + ", speed=" + speed + ", color=" + color + "]";
	}
}

public class CarRunner {
	public static void main(String ar[]) {
		Car a=new Car("supra",23,"black");
		Car b=new Car("jeep",12,"white");
		a.details(b);
				
	}
}
