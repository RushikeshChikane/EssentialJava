package Function;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// Enter 3 numbers from the user 
		//& make a function to print their average
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int average=(a + b +c)/3;
		
		System.out.println("Average="+average);
		

	}

}
