package Hierachical;
import java.util.*;

class Emp12{
	double id;
	String name,desg;
	
	Emp12(double id,String name,String desg){
		this.id=id;
		this.name=name;
		this.desg=desg;
	}
	
	public void display() {
		System.out.println("is:"+id);
		System.out.println("Name:"+name);
		System.out.println("Desiganation:"+desg);
	}
}

class Part_time extends Emp12{
	double hr_rate,sal;
	int n_hr;
	
	Part_time(double id,String name,String desg, int n_hr,double hr_rate){
		super(id,name,desg);
		this.n_hr=n_hr;
		this.hr_rate=hr_rate;
	}
	
	public void cal_sal() {
		System.out.println("No of hr:"+n_hr);
		System.out.println("Hr rate:"+hr_rate);
		System.out.println("Salery:"+(n_hr*hr_rate));
	}
}

class Full_time extends Emp12{
	double day_rate,sal;
	int n_day;
	
	Full_time(double id,String name,String desg,int n_day,double day_rate){
		super(id,name,desg);
		this.n_day=n_day;
		this.day_rate=day_rate;
	}
	
	public void cal_sal() {
		System.out.println("No if day:"+n_day);
		System.out.println("Day Rate:"+day_rate);
		System.out.println("Sallary:"+(n_day*day_rate));
	}
}

public class Hierarchical_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n_hr, n_day,hr,ch;
		double id,hr_rate,day_rate;
		String name,desg;
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1:Accept details of part time empl");
			System.out.println("2:Accept details of full time empl");
			System.out.println("3:Exit");
			System.out.println("Enter ur choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter id,name,desg,n of hr,hr rate");
				id=sc.nextDouble();
				name=sc.next();
				desg=sc.next();
			    n_hr = sc.nextInt();
			    hr_rate=sc.nextDouble();
			    Part_time p1=new Part_time(id,name,desg,n_hr,hr_rate);
			    p1.display();
			    p1.cal_sal();
			    
				break;
				
			case 2:
			    System.out.println("Enter id,name,desg,no od days,day rate");
			    id=sc.nextDouble();
			    name=sc.next();
			    desg=sc.next();
			    n_day=sc.nextInt();
			    day_rate=sc.nextDouble();
			    Full_time f1=new Full_time(id,name,desg,n_day,day_rate);
			    f1.display();
			    f1.cal_sal();
			    
			    break;
			    
			case 3:
				System.exit(0);
				
				break;
				
				default:System.out.println("Invalid Choice");
			}
		}while(ch<=3);
		

	}

}
