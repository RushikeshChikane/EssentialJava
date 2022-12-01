package String;
import java.util.*;
public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Declearation
		
		String name="Tonny";
		//printing String
		System.out.println("1)Output= "+name);
		
		//2)Taking string input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("2)Write Input =");
		String name1=sc.next();//next(); is using for String input 
		                       //nextLine(); is used for taking full sentence
		                       //next int(); is used for taking integer
		System.out.println("Output="+name1);

	}

}
