//parameterized constructor
public class Student4 {
	int id;
	String name;
	
	//creating parameterized constructor
	Student4(int i,String n){
		id=i;
		name=n;
	}
	
	// method to display the values
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object and passing values
		Student4 s1=new Student4(111,"Rushi");
		Student4 s2=new Student4(112,"Rajat");
		//calling method to display values of object
		s1.display();
		s2.display();
		

	}

}
