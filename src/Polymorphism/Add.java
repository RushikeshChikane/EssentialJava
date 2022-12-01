package com.Polymorphism;

public class Add {
	
	private int a;
	private int b;
	
	public Add() {
		// TODO Auto-generated constructor stub
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Addition="+a+"+"+b+"="+(a+b);
	}
	

}
