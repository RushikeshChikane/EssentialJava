package Function;
import java.util.*;
public class ex3 {
//Write a function which takes in 2 numbers and returns the greater of those two.

	public static int getGetter(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println((getGetter(a,b)));

	}

}
