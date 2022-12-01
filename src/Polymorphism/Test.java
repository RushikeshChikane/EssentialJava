package com.Polymorphism;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Line t=new Line();
		t.draw();
		
		Shape s=new Line();
		s.draw();
		
		
		Elipse e=new Elipse();
		e.draw();
		
		Point p=new Point();
		p.setX(2);
		p.setY(5);
		System.out.println(p.toString());
		
		Add a=new Add();
		a.setA(5);
		a.setB(5);
		System.out.println(a.toString());
		
		Line1 l1=new Line1();
		l1.draw();
	    System.out.println(l1.toString());
	    
		
		Rectangle r=new Rectangle();
		r.draw();
		System.out.println(r.toString());
	    
		
		
		

	}

}
