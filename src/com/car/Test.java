package com.car;
import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Car> l=new ArrayList<Car>();
		l.add(new Car(2011,"Tata",21));
		l.add(new Car(2018,"Force",20));
		l.add(new Car(2015,"Suzuki",18));
		
		Collections.sort(l);  
		for(Car obj:l){  
		System.out.println(obj.year+" "+obj.make+" "+obj.milage);  
		}  
	
        System.out.println("Sorting by milage");
        Collections.sort(l,new CarMilageComparator());
        for (Car obj:l) {
        	System.out.println(obj.year+" "+obj.make+" "+obj.milage); 
        }
        
        System.out.println("Sorting by Year");
        Collections.sort(l,new CarYearComparator());
        for (Car obj:l) {
        	System.out.println(obj.year+" "+obj.make+" "+obj.milage); 
        }

		

	}

}
