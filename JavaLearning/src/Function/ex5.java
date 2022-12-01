package Function;
import java.util.*;
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class ex5 {
	
	public static boolean isElligable(int age) {
	   if(age>18) {
		   return true;
	   }else {
		   return false;
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		
		System.out.println(isElligable(age));
		

	}

}
