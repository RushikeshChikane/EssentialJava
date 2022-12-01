package SingleInheritance; //package
import java.util.*;  //importing scanner class

    //class 1
class Area{
	double r,A;   //parameter passing
	
	//constructor
	Area(double r){
		this.r=r;
	}
	
	//method
	void cal_area() {
		A=3.14*r*r;
		System.out.println("Radiis="+r+"\n Area="+A);
	}
}

  //class 2
class Volume extends Area{
	double h,v;  // parameter passing
	
	//constructor
	Volume(double r, double h){
		super(r);
		this.h=h;
	}
	
	//method
	void cal_vol(){
		v=A*h;
		System.out.println("H="+h+"\n Volume="+v);
	}
	
	
}
      // Main Class
public class Single {

	public static void main(String[] args) {
		
		double r,h;  // parameter passing
		
		Scanner sc=new Scanner (System.in);  
		System.out.println("Enter r & h");
		r=sc.nextDouble();
		h=sc.nextDouble();
		
		//object calling
		Volume v1=new Volume(r,h);
		v1.cal_area();
		v1.cal_vol();
		

	}

}
