import java.util.Scanner;

//The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
//each is the sum of the preceding two. Write a recursive method in Java which, given n,
//returns the nth Fibonacci number.

public class recursionQ_10 {
public static int fibonachi (int a,int b ,int i,int c) {
	
	if(i==0) {
		
		return c ;
	}
	c=a+b;
	System.out.print(c+" ");
	return fibonachi(b,c,i-1,c);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter one number");
		int in=Sc.nextInt();
	System.out.print("Series: "+1+" "+1+" ");
		int c=fibonachi(1,1,in-2,0);
		System.out.println();
		System.out.println("Fibonacci number at position "+in+" is "+c);
	}

}

//Sample run:
//Enter one number
//10
//series: 1 1 2 3 5 8 13 21 34 55 
//Fibonacci number at position 10 is 55