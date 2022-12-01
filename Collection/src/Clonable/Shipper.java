package Clonable;
import java.util.*;
import java.lang.*;
public class Shipper implements Cloneable{
	
	int id;
	String name;
	
	public Shipper() {
		this.id=12;
		this.name="Surya Courier";
	}
	
	public Shipper(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		// Logic for creating replica of same object as another new object
		Shipper sh=new Shipper();
		sh.id=this.id;
		sh.name=this.name;
		//sh is pointing newly created and
		//data copied  object using clonniing technique
		return sh;
	}
	
	
	public String ToString() {
		return "Id="+id+" "+name;
		}
	
	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shipper sh1=new Shipper(24,"fedex");
		Shipper sh2=new Shipper(34,"Dhl");
		Shipper sh3=new Shipper(54,"Cargo");
		
		System.out.println(sh1.toString());
		System.out.println(sh2.toString());
		System.out.println(sh3.toString());
		
		//Shipper sh4=(Shipper)sh2.clone();
		
		try {
			Shipper sh4=(Shipper)sh2.clone();
			System.out.println(sh4.id+" "+sh4.name);		
			
		}catch (Exception e) {
			System.out.println(sh2.ToString());
		}
		
		
		
		
	
		
	}

}
