package Function;
//Write a function that calculates the 
//Greatest Common Divisor of 2 numbers
import java.util.*;
public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int n1 = sc.nextInt();
	       int n2 = sc.nextInt();
	 
	       while(n1 != n2) { 
	           if(n1>n2) {
	               n1 = n1 - n2;
	           } else {
	               n2 = n2 - n1;
	           }
	       }
	       System.out.println("GCD is : "+ n2);
	   }   


	
}
