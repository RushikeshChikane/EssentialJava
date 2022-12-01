package Array;
import java.util.*;
public class ex3 {
//Ascending decending order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int numbers[]=new int [size];
		
		//input
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		boolean isAscending = true;
		
		for(int i=0;i<numbers.length-1;i++) {
			
			if(numbers[i]>numbers [i+1]) {//condition for decending order
				isAscending =false;
			}
		}
		
		if(isAscending) {
			System.out.println("Arry stored in Ascending Order");
		}else {
			System.out.println("Array stored in decending order");
		}

	}

}
