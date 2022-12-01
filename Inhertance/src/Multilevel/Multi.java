package Multilevel;
import java.util.*;
   //class 1
class Area {
	//parameters
	double r,A;
	//constructor calling
	Area(double r){
		this.r=r;
	}
	
	void cal_area() {
		A=3.14*r*r;
		System.out.println("Area="+A);
	}
}


//Class 2
class Volume extends Area {
	//parameter 
	double h,v; 
	//constructor
	Volume(double r,double h){
		super(r);
		this.h=h;
	}
	//method
	void cal_vol() {
		super.cal_area();
		v=A*h;
		System.out.println("Volume="+v);
	}
}

   //class 3

class Volume1 extends Volume{
	//parameter
	double l,v1;
	//constructor
	Volume1(double r,double h,double l){
		super(r, h);
		this.l=l;
		}
	//method
	void cal_vol1() {
		super.cal_vol();
		v=v*l;
		System.out.println("Volume1= "+v);
	}
	
}

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r,h,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r,h,l");
		r=sc.nextDouble();
		h=sc.nextDouble();
		l=sc.nextDouble();
		
		Volume1 v1=new Volume1(r,h,l);
		v1.cal_vol1();
		

	}

}
