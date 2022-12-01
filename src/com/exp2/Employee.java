package com.exp2;

public class Employee extends Person {
	    
	    protected int id;
	    protected String department;
	    protected double basicSalary;
	    protected double hra;
	    protected double da;
	    
	    
		public Employee(String firstName, String lastName, String email, String contactNumber,
				       int id, String department, double basicSalary, double hra, double da) {
			super(firstName,lastName,email,contactNumber);
			this.id = id;
			this.department = department;
			this.basicSalary = basicSalary;
			this.hra = hra;
			this.da = da;
		}

		

		
		

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public double getHra() {
			return hra;
		}

		public void setHra(double hra) {
			this.hra = hra;
		}

		public double getDa() {
			return da;
		}

		public void setDa(double da) {
			this.da = da;
		}

       
		  public  double computePay(){
		        //Logic for calculating salary
		        double salary=this.basicSalary + this.hra+ (da * 20);
		        return salary;
		    }



        //toString is object class
		@Override
		public String toString() {
			// TODO Auto-generated method stub
		   String data=" "+this.id+" "+this.department+" "+this.basicSalary+" "+this.hra+" "+this.da;
			return super.toString()+" "+data;
			
		}
		
	
		

	    


		
	    
	    
	    
	    

}
