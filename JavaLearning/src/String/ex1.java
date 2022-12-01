package String;
import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		//Que=Take an array of Strings input from the user 
		//& find the cumulative (combined) length of all
		//those strings.

		
		Scanner sc=new Scanner(System.in);
		//taking size of array from user
		int size=sc.nextInt();
		String arr[]=new String[size];
		int totLength =0;
		
		
		for(int i=0;i<size;i++) {
			//taking array element from user
			arr[i]=sc.next();
			//taking total length of strings
			totLength +=arr[i].length();
			
		
		}
		System.out.println(totLength);
		
				
		
		

	}

}
