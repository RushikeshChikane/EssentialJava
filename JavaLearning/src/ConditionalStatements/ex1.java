package ConditionalStatements;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.println("Enter Case");
		int ch=sc.nextInt();	
		switch(ch){
		case 1: 
			System.out.println("Addition="+(a+b));
			break;
		case 2: 
			System.out.println("Subtraction="+(a-b));
			break;
		case 3:
			System.out.println("Multiplication="+(a*b));
			break;
		case 4:
			System.out.println("Division="+(a/b));
			break;
		case 5:
			System.out.println("Reminder="+(a%b));
			break;
		default: 
			System.out.println("Invalid Choice");
		
		
		}
		

	}

}
