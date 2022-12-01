package collectionDemo;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {1,2,5,6};
		int marks[]= {75,65,89,48,98};
		String trainers[]= {"Prachi", "Kishori", "Madhura", "Nilesh", "Amit" };
		
		System.out.println("Nymbers Printing");
		// with for loop method
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		// with for each method
	    System.out.println("numbers Printing");
	    for(int i : numbers){
	    	System.out.println(i);
	    }
	    
	    System.out.println("marks printing");
	    // with for each method
	    for(int m :marks) {
	    	System.out.println(m);
	    }
	    
	    
      
	    //Student Class Obj
	    //creatng employee ibj
	    Student[] obj=new Student[5];
	    
	    //creataing & initilixing acual Student object usying constructor
	    obj[0]=new Student(1,"Rushikesh","19/12 2.45", "19/12/1998","Satara" );
	    System.out.println(" Student 1");
	    obj[0].sowData();

	    
	    //Employee class
	    
	    //creating array of Employee object
	    Employee[] e=new Employee[2];
	    
	    //creating actual employee boject
	    e[0]=new Employee();
	    e[1]=new Employee();
	    
	    //assigning data to Employee Object
	    e[0].setData(1,"Rushikesh");
	    e[1].setData(2, "Rushi");
	    
	    //display the employee object data
	    e[0].showData();
	    e[1].showData();
	    

	}

}
