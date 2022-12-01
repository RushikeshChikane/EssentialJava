package com.exp2;

public class Manager extends Employee{
	
	private double bonus;
	private int stockOption;
	
	
	
	public Manager(String fName, String lName, String email,String contact, 
			       int id, String dept, double bSal, double da, double hra,
			       double bonus,int stockOption) {
            
		           super(fName,lName,email,contact,id,dept,bSal,da,hra);
		           this.bonus=bonus;
		           this.stockOption=stockOption;
	}
	
	   @Override  
	    public  double computePay(){
	        float profit  =0.7f;
	        double salary=this.bonus + (stockOption * profit  ) + super.computePay();
	        return salary;
	    }



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String data=" "+this.bonus+" "+this.stockOption;
		return super.toString()+" "+data;
		}

	

	

	
   
	

}
