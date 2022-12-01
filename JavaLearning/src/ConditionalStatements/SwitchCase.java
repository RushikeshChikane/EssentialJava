package ConditionalStatements;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int button =sc.nextInt();
		
		switch(button) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namaste");
		break;
		case 3: System.out.println("Bonjur");
		break;
		default: System.out.println("Invalid button");
		}
		
		

	}

}
