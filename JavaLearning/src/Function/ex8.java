package Function;
//Two numbers are entered by the user, x and n.
//Write a function to find the value of one number 
//raised to the power of another i.e. xn.
import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("Enter x");
	       Scanner sc = new Scanner(System.in);
	       int x = sc.nextInt();
	       System.out.println("Enter n");
	       int n = sc.nextInt();
	 
	       int result = 1;
	       //Please see that n is not too large or else result will exceed the size of int
	       for(int i=0; i<n; i++) {
	    	      result = result * x;
	       }
	 
	       System.out.println("x to the power n is : "+ result);
	   }   

}
