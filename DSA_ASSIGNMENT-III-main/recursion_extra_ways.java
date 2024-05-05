
public class recursion_extra_ways {
static void p(int x) {
//	if(x==6) {
//		return;
//	}
	System.out.print(x+" ");
	x++;
	if(x<=5) {
	p(x);}
}
	public static void main(String[] args) {
		
p(1);
System.out.println(fib(2,3,5));
	}
	static int fib(int a,int b,int n) {
		if(n==1)return a;
		if(n==2)return b;
		return fib(a,b,n-1)+fib(a,b,n-2);
			
		
	}
	
}
class Solution {

	   int binarysearch(int arr[], int n, int k) {
	   int s=0;int e=n-1;
	   int mid =(s+e)/2;
	   while(s<=e){
	        mid =s+(e-s)/2;
	       if(arr[mid]==k){
	           return mid;
	       }
	       else if(arr[mid]<k){
	           s=mid+1;
	       }
	       else if(arr[mid]>k){
	      e=mid-1;
	}

	   }
	return -1;
	   }
	}