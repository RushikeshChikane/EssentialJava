package abc;
import java.util.*;
class Stud{
	int id;
	String name,address;
	
	Stud(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		System.out.println("Student id="+id+"Student name="+name+"Stdent Address="+address);
	}
}

class Marks extends Stud{
	int m1,m2,m3;
	
	Marks(int id,String name,String address,int m1,int m2,int m3){
		super(id,name,address);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	void show() {
		System.out.println("m1="+m1+"\nm2="+m2+"\nm3="+m3);
	}
	
}

class Result extends Marks{
	double total,per;
	
	Result(int id, String name,String address,int m1,int m2, int m3){
		super(id,name,address,m1,m2,m3);
		
	}
	void cal_result() {
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Total="+total+"\n Percentage="+per);
	}
}


public class MultilevellEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id,m1,m2,m3;
		String name,address;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter id, name and address of Student");
		id=sc.nextInt();
		name=sc.next();
		address=sc.next();
		
		System.out.println("Enter Marks of Student");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		
		//Object calling
		Result r1=new Result(id,name,address,m1,m2,m3);
		r1.display();
		r1.show();
		r1.cal_result();
	}

}
