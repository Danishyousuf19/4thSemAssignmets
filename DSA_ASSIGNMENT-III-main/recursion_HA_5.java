//In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking
//out of it. On peg a is a stack of n disks, each larger than the next, so that the smallest is on
//the top and the largest is on the bottom. The puzzle is to move all the disks from peg a to
//peg c, moving one disk at a time, so that we never place a larger disk on top of a smaller
//one. See Figure 1 for an example of the case n = 4. Write a recursive program using Java
//for solving the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub problem
//of moving all but the nth disk from peg a to another peg using the third as “temporary
//storage.”)

public class recursion_HA_5 {
	static int count =0;
static void TOH(int n,String source,String helper,String destination) {
	
	if(n==1) {
		System.out.println("transfer disk "+n+" from "+source+" to "+destination);
		count++;
		return;
	}
	//transfer n-1 from source to helper
	TOH(n-1,source,destination,helper);
	count++;
	System.out.println("transfer disk "+n+" from "+source+" to "+destination);
	//transfer n-1 back to destination
    TOH(n-1,helper,source,destination);
   
}
	public static void main(String[] args) 
	{
	
		 TOH(3, "source","helper","destination");
System.out.println("Nnumber of Steps = "+count);
	}

}
//
//transfer disk 1 from source to helper
//transfer disk 2 from source to destination
//transfer disk 1 from helper to destination
//transfer disk 3 from source to helper
//transfer disk 1 from destination to source
//transfer disk 2 from destination to helper
//transfer disk 1 from source to helper
//transfer disk 4 from source to destination
//transfer disk 1 from helper to destination
//transfer disk 2 from helper to source
//transfer disk 1 from destination to source
//transfer disk 3 from helper to destination
//transfer disk 1 from source to helper
//transfer disk 2 from source to destination
//transfer disk 1 from helper to destination
//Number of steps= 15