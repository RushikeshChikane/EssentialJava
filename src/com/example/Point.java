package com.example;

public class Point {
	private int x;
	private int y;
	

	

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int num) {
		this.x = num;
	}
	public int getY() {
		return y;
	}
	public void setY(int num) {
		this.y = num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String strData="x="+this.getX()+", y="+this.getY();
		return strData;
	}

	
	

}
