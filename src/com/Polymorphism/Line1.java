package com.Polymorphism;

public  class Line1 extends Shape{
	
	
	
	private Point startPoint;
	private Point endPoint;
	
	public Line1() {
		this.startPoint=new Point();
		this.startPoint.setX(3);
		this.startPoint.setY(6);;
		
		this.endPoint=new Point();
		this.endPoint.setX(2);
		this.endPoint.setY(5);
		
	}
	
    public Line1(Point pt1,Point pt2) {
    	this.startPoint=pt1;
    	this.endPoint=pt2;
    	
    }
	
	
	 @Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line 1 on canvas");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
        String strstartPoint=this.startPoint.toString();
        String strendPoint = this.endPoint.toString();
        String data="("+strstartPoint+"),("+strendPoint+")";
        return data;

	}

	
	
	 
	 

}
