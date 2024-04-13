
import java.util.*;

@SuppressWarnings("serial")
class CustomExcep extends Exception {

	CustomExcep() {
		super("A == 0");
	}

	public String getMessage() {
		return "A==0";

	}

	public void ZeroError() {
		System.out.println("Value is 0");
	}

}

@SuppressWarnings("serial")
class error extends Exception {
	error(String h) {
		super(h);
	}
}

@SuppressWarnings("serial")
class Excep extends Exception {
	String h;

	Excep(String a) {
		h = a;
	}

	public String getMessage() {
		return h;

	}
}

public class Exceptions {

	static void topic1(int a) throws error, CustomExcep, Excep {

		if (a > 20) {
			System.out.println("Value of A = " + a);
		} else if (a <= 20 && a > 0) {
			throw new error("A>0 and A<=20");
		} else if (a == 0)
			throw new CustomExcep();
		else if (a < 0)
			throw new Excep("A<0");

	}

	static void topic3() throws Exception {
		System.out.println(3 / 0);
	}

	@SuppressWarnings("null")
	static void topic() {
		try {
			try {
				int a = 90;

				a = a / 0;
			} catch (Exception E) {
				System.out.println(E.getMessage());

				int a[] = {};
				int b = 9;
				String s = null;
				Object f = 0;
				System.out.println((String) f);
				System.out.println(s.lastIndexOf(b));
				System.out.println(b / a[1]);
				System.out.println(b / 0);
			}

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException i) {
			System.out.println(i);
		} catch (NullPointerException g) {
			System.out.println(g);
		} catch (ClassCastException h) {
			System.out.println(h);
		} catch (Throwable i) {
			System.out.println(i);
		}

		finally {
			System.out.println("Program Exited");
		}
		System.out.println("What! it runs");
	}

	public static void main(String[] args) throws CustomExcep, Excep {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		try {
			int a = sc.nextInt();
			topic1(a);
			sc.close();

		} catch (InputMismatchException d) {

			System.out.println("Error! enter a number : " + d);

		} catch (CustomExcep E) {
			E.ZeroError();

		} catch (Excep e) {
			System.out.println(e.getMessage());

		} catch (error r) {
			System.out.println(r.getMessage());
		}
//		try {
//			topic3();
//		} catch (Exception c) {
//			System.out.println(c.getMessage());
//		}

//		topic();

	}

}
