import java.util.*;

class MyThread implements Runnable{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("running");
		
		sc.close();	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+"IS A EVEN NUMBER");
			}
		}
		MyThread a=new MyThread();
		new Thread(a);
		sc.close();

	}

}
