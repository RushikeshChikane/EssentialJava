package String;

public class CompareTo {

	public static void main(String[] args) {
		//CompareTo compare the to Strings
		
		String name1="Tonny";
		String name2="Tonny";
		
		if(name1.equals(name2)) {
			System.out.println("String are same");
		}else {
			System.out.println("String are not same");
		}
		
		
		
		//DO NOT USE == to check for string equality
	       //Gives correct answer here
	       if(name1 == name2) {
	           System.out.println("They are the same string");
	       } else {
	           System.out.println("They are different strings");
	       }
	       
	       
	     //DO NOT USE == to check for string equality 
	       //Gives incorrect answer here
	       if(new String("Tony") == new String("Tony")) {
	           System.out.println("They are the same string");
	       } else {
	           System.out.println("They are different strings");
	       }


	}

}
