package com.example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Point pt =new Point(2,5);
		System.out.println(pt.toString());
		
		
		Line li =new Line();
		li.draw();
		System.out.println(li.toString());
		
		
		
		//line finalize method calling
		li=null;
		System.gc();
		
		
		
		
		
		

	}

}
