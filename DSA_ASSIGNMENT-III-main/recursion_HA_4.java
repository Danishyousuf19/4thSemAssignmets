import java.util.Arrays;

public class recursion_HA_4 {
static void sort(int a[],int i,int j,int pivot) {
	if(i<a.length&j<a.length) {
		if(a[i]<=pivot) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;j++;
			
		}
		sort(a,++i,j,pivot);
	}
}
	 
	  public static void main(String[] args) {
	    int[] arr = {-6, -5, -7, -2, -4, -9, -8 -1};
	    int pivot = 7;
	    sort(arr,0,0,pivot);
	    for(int e:arr) {
	    	System.out.print(e+" ");
	    }
	  
	  }
	}
//6 5 7 2 4 1 8 9 
