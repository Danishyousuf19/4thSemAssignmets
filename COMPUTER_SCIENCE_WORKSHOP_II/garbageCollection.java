
public class garbageCollection {
	String d;

	public garbageCollection(String d) {

		this.d = d;
	}

	static void meth1() {
		garbageCollection ob1 = new garbageCollection("I am ob 1");
		System.out.println(ob1.d);
		meth2();
	}

	static void meth2() {
		garbageCollection ob2 = new garbageCollection("I am ob 2");
		System.out.println(ob2.d);
	}

	void meth3(garbageCollection g) {

		garbageCollection ob5 = new garbageCollection("I am ob 5");
		System.out.println(g.d);
		System.out.println(ob5.d);
		System.out.println(g);
	}

	String msg() {
		return "I am Hacker ";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("successfully cleaned : " + this.d);

	}

	public static void main(String[] args) {
		meth1();
		garbageCollection ob3 = new garbageCollection("I am ob 3");
//		System.out.println(ob3.d);
		garbageCollection ob4 = new garbageCollection("I am ob 4");
		@SuppressWarnings("unused")
		garbageCollection ob6 = new garbageCollection("I am ob 6");

		ob6 = null;
		ob4.meth3(ob3);
		System.out.println(ob3 + "  " + ob4);
		ob3 = ob4;
		System.out.println(ob3 + "  " + ob4);
		System.out.println(new garbageCollection("I an ob 7").msg());  
		System.gc();
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());

		meth2();
//		garbageCollection ob5 = new garbageCollection(d:"I am ob 5");
//		garbageCollection ob8 = new garbageCollection(d: "I am ob 8");
//		@SuppressWarnings("unused")
//		garbageCollection ob9 = new garbageCollection(d: " I am ob 9");
//
//		ob9 = null;
//		ob8.meth3(ob5);
//		System.out.println(ob5+" "+ob8);
//		ob5 = ob8;
//		System.out.println(ob5+ " "+ob8);
//		System.out.println(new garbageCollection(d:"I am ob 2").msg());
		System.gc();
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		

	}

}
