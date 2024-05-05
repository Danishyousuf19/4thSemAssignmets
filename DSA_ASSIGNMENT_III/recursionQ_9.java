import java.util.Scanner;

//Write a recursive Java method that takes a character string s and outputs its reverse. For
//example, the reverse of ' pots&pans' would be ' snap&stop'.
public class recursionQ_9 {
public static void reverse(String a,String nue,int idx) {
	if(idx<0) {
		System.out.println("reverse : "+nue);
		return;
		
	}
	char current =a.charAt(idx);
	reverse(a,nue+current,idx-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter String");
		String x=Sc.nextLine();
		int n=x.length()-1;
		reverse(x,"",n);
		
	}

}
//enter String
//pots&pans
//reverse : snap&stop
