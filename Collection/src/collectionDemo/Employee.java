package collectionDemo;
import java.util.*;
public class Employee {
	int id;
	String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public void setData(int c,String d) {
		this.id=c;
		this.name=d;
	}
	
	public void showData() {
		System.out.print("Employee id="+id+"  Employee name="+name);
		System.out.println();
	}

}
