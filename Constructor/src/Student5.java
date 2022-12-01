// Constructor Overloading
public class Student5 {
	int id;
	String name;
	int age;
	
	//creating 2 argument constructor
	Student5(int i, String n){
		id=i;
		name=n;
	}
	
	//creating 3 argument constructor
	Student5(int i,String n, int a){
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object
		Student5 a=new Student5(111,"Rushi");
		Student5 b=new Student5(112,"Rajat",26);
		
		// displaying method
		a.display();
		b.display();
		

	}

}
