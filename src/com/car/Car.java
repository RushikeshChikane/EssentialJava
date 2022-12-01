package com.car;
import java.util.*;
import java.io.*;


public class Car implements Comparable<Car> {
	
	public int year;
	public String make;
	public int milage;
	
	public Car(int year,String make,int m) {
		this.year=year;
		this.make=make;
		this.milage=m;
	}
	
	public int compareTo(Car obj) {
		
		Car secondCar = (Car)obj;
		
		if(year > secondCar.year)
		return 1;
		
		if (year < secondCar.year)
			return -1;
		else 
			return 0;
		
	}

}
