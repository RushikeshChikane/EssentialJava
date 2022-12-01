package ConditionalStatements;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of Month");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: System.out.println("Janewari");
		      break;
		case 2: System.out.println("Februvari");
	      break;     
		case 3: System.out.println("March");
	      break; 
		case 4: System.out.println("April");
	      break;  
		case 15: System.out.println("May");
	      break;  
		case 6: System.out.println("Jun");
	      break;  
		case 7: System.out.println("July");
	      break;  
		case 8: System.out.println("August");
	      break;  
		case 9: System.out.println("September");
	      break;  
		case 10: System.out.println("October");
	      break;
		case 11: System.out.println("November");
	      break;
		case 12: System.out.println("December");
	      break;  
		case 13: System.out.println("Invalid Month");
	      break;  
		}
		

	}

}
