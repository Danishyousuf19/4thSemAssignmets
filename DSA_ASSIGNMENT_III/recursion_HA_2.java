import java.util.Arrays;
import java.util.Scanner;
//Write a recursive method in Java to search an element of an array using binary search.
//Sample run-1:
public class recursion_HA_2 {
static int binarysearch(int arr[],int target,int firstidx,int lastidx) {
	if(arr.length==0){
		return -1;
	}
	int mid=firstidx+(lastidx-firstidx)/2;
	if(arr[mid]==target) {
		return mid;
	}
	else if(arr[mid]<target) {
		return binarysearch(arr,target,mid+1,arr.length-1);
	}
	else if(arr[mid]>target) {
		return binarysearch(arr,target,0,mid-1);
	}
	return -1;
}
	public static void main(String[] args) {
	System.out.println("Enter number of elements in the array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    System.out.println("Enter "+n+" number of elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Enter the element to search");
    int t=sc.nextInt();
    System.out.println("The "+t+" is present at index "+binarysearch(arr,t,0,n-1));
	}

}
//Enter number of elements in the array
//5
//Enter 5 number of elements
//11
//22
//33
//44
//55
//Enter the element to search
//33
//The 33 is present at index 2