package com.Polymorphism;

public class Rectangle extends Shape{
	
	private Point startPoint;
	private Point endPoint;
	
	public Rectangle() {
		this.startPoint=new Point();
		this.startPoint.setX(4);
		this.startPoint.setY(8);
		
		this.endPoint=new Point();
		this.endPoint.setX(2);
		this.endPoint.setY(4);
	}
	
	public Rectangle(Point pt1,Point pt2) {
		this.startPoint=pt1;
		this.endPoint=pt2;
		
	}
	
	
	
	@Override
	public String toString() {
		String strstartPoint=startPoint.toString();
		String strendPoint=endPoint.toString();
		String data="("+strstartPoint+"),("+strendPoint+")";
		return data;
	}
	
	@Override
	 void draw() {
		System.out.println("Rectangle Drawing...");
	}

}
