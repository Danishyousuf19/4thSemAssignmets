import java.util.Scanner;

//Write a menu driven program to perform several mathematical operations. Different choices 
//for the mathematical operations are as follows.
//1. Determine the factorial of a number
//2. Determine X^Nfor two numbers X, N
//3. Determine GCD of two number.
//4. Binary equivalent of a decimal number
//5. Product of two numbers.
//NOTE: All the mathematical operations must be performed using the recursive method. 

public class menu_driven_recursionQ_7 {

	public static void  factorial(int n,int f) {
		if(n==0) {
		System.out.println("Factorial  : "+f);
		return;
		}
		
		factorial(n-1,f*n);
	}
	public static void  power(int n,int m,int p) {
		if(m==0) {
		System.out.println("Power  : "+p);
		return ;
	}
		power(n,m-1,p*n);
		}
	public static int  gcd(int n,int m) {
		if(m==0) {
			return n;
		}
		else return gcd(m,n%m);
	}
	public static void  binary(int n,String b) {
		
		if(n==0) {
		System.out.println("Binary : "+b);
		return;
		}
		binary(n/2,n%2+b);
	}
	public static void  product(int n ,int m,int p) {
		if(m==0) {
		System.out.println("Product : "+p);
		return;
		}
		product(n,m-1,p+n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1-->Determine the factorial of a number");
		System.out.println("2-->Determine X^Nfor two numbers X, N");
		System.out.println("3-->Determine GCD of two number.");
		System.out.println("4-->Binary equivalent of a decimal number");
		System.out.println("5-->Product of two numbers");
		
		System.out.println("Chose any  option");
		int choice =sc.nextInt( );
		for(;choice!=0;choice =sc.nextInt()) {
			
			switch (choice) {
			case 1: {
				System.out.println("Enter a number");
				int N1=sc.nextInt();
				factorial(N1,1);
				System.out.println("Chose any  option");
				break;
			}
			case 2: {
				System.out.println("Enter  base number");
				int N2=sc.nextInt();
				System.out.println("Enter power");
				int N2b=sc.nextInt();
				power(N2,N2b,1);
				System.out.println("Chose any  option");
				break;
			}
			case 3: {
				System.out.println("Enter  one number");
				int N3=sc.nextInt();
				System.out.println("Enter another number");
				int N3b=sc.nextInt();
			    System.out.println("GCD : "+gcd(N3,N3b));
			    break;
			}
			case 4: {
				System.out.println("Enter a number");
				int N4=sc.nextInt();
				 if(N4==0) {
				    	System.out.println("Binary : 0");
				    break;}
			    binary(N4,"");
			    System.out.println("Chose any  option");
			    break;
			}
			case 5:{
				System.out.println("Enter one number");
				int N5=sc.nextInt();
				System.out.println("Enter another number");
				int N5b=sc.nextInt();
				product(N5,N5b,0);
				System.out.println("Chose any  option");
				break;
			}
			
		    default:{
		    	System.out.println("Invalid choice! Please try again.");
			break;
		    }
			 }
			
		}
		System.out.println("Exiting from code");
	}
}
