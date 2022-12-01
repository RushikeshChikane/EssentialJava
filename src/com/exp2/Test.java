package com.exp2;
import java.util.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
         
		
		Person per =new Person("Rushikesh","Chikane","rushiiii@1123","1236547890");
		System.out.println(per.toString());
		
		Employee emp = new Employee("Rushikesh","Chikane","rushiiii@1123","1236547890",11,"Mech",15000,2300,1200);
		emp.computePay();
		System.out.println(emp.toString());
		System.out.println(emp.computePay());
		
		
		Manager man= new Manager("Rushikesh","Chikane","rushiiii@1123","1236547890",11,"Mech",15000,2300,1200,5000,500) ;
		man.computePay();
		System.out.println(man.toString());
		System.out.println(man.computePay());

	}

}
