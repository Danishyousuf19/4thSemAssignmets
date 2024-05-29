
import java.util.*;

class ADDTHREAD extends Thread {
    public void run() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter numbers to add:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Multiplication is:" + (a + b));
		}
    }
}

class DIVTHREAD extends Thread {
    public void run() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter numbers to div:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Multiplication is:" + (a/b));
		}
    }
}

class SUBTHREAD extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sub:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Multiplication is:" + (a-b));
    }
}

class MULTHREAD extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to multiply:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication is:" + (a*b));
        sc.close();
    }
}

public class Q1 {

    public static void main(String[] args) {
        ADDTHREAD a = new ADDTHREAD();
        DIVTHREAD s = new DIVTHREAD();
        SUBTHREAD d = new SUBTHREAD();
        MULTHREAD m = new MULTHREAD();
        a.start();
        s.start();
        d.start();
        m.start();

    }

}
