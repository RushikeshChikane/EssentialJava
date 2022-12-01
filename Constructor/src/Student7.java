// copying values without constructor
public class Student7 {
	int id;
	String name;
	
	Student7(int i,String n){
		id=i;
		name=n;	
	}
	
	Student7(){}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student7 a=new Student7(11,"Rushi");
		
		Student7 b=new Student7();
		b.id=a.id;
		b.name=a.name;
		 
		a.display();
		b.display();

	}

}
