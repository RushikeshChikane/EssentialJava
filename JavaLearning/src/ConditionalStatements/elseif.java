package ConditionalStatements;
import java.util.*;
public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int a =sc.nextInt();
	    int b =sc.nextInt();
	    
	    if(a == b) {
	    	System.out.println("Equals");
	    }
	    else if(a>b) {
	    	System.out.println("a is greater");
	    }
	    else {
	    	System.out.println("b is greater");
	    }

	}

}
