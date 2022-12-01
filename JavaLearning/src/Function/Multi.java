package Function;
import java.util.*;
public class Multi {
	
	public static  int calculateProduct(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Multiplication="+calculateProduct(a,b));

	}

}
