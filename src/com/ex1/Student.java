package com.ex1;

import com.exp2.Manager;

public class Student {
	
	private int id;
	private String fullName;
	private String qualification;
	private String email;
	
	//static variable
	public static int count;
	
	
    // setter getter for full name
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	//const1 with no argument
	public Student() {
		this.id=45;
		this.fullName="Rushikesh Chikane";
		this.qualification="BE";
		this.email="R@Chikane@123654";
		System.out.println(" Customer is Called...");
		count=count+1;
	}
	//const2 with 3 argument
	public Student(int i,String name,String education) {
		this.id=i;
		this.fullName=name;
		this.qualification=education;
		count=count+1;
	}
	//const3 with 4 argument
	public Student(int i,String name, String education, String em) {
		this.id=i;
		this.fullName=name;
		this.qualification=education;
		this.email=em;
		count=count+1;
	}
	
	



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String data=" "+this.id+" "+this.fullName+" "+this.qualification+" "+this.email;
		return data;
	}
	
	//instant method called by object referance
	public void ShowStatus() {
		System.out.println("I am Alive...");
	}
	
	//static method called by class name
	public static int GetCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without argument
		Student s=new Student();
		System.out.println(s.toString());
		
	//3 argument calling
		Student s2=new Student(1,"Rushikesh Chikane","Btech");
		System.out.println(s2.toString());
		
		//4argument calling
		Student s3=new Student(1,"Rushikesh Chikane","Mtech","rushikeshc@123");
		System.out.println(s3.toString());
		
		Student s5   =new Student();
		Student.GetCount();
		System.out.println(" Count="+Student.GetCount());
				

	}

}
