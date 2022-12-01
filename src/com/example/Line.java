package com.example;

public  final  class Line extends Shape{
    //If you declare any parameter as final, you cannot change the value of it.    
    static final int data;//static blank final variable  
    static{ data=50;}  

    private Point startPoint;
    private Point endPoint;

    public Line(){
        //this method would be automatically called at the time of construction of object
        this.startPoint=new Point(0, 0);
        this.startPoint.setX(0);
        this.startPoint.setY(0);
        
        this.endPoint=new Point(0, 0);
        this.endPoint.setX(0);
        this.endPoint.setY(0);
        
        this.color="blue";
        
        
    }

    public Line(Point pt1, Point pt2,String c){
        this.startPoint=pt1;
        this.endPoint=pt2;
        this.color=c;
    }

    
    void draw(){
        System.out.println("drawing line on canvas ");
    }  

    @Override
    public String toString() {
    
        String strStartPoint=this.startPoint.toString();
        String strEndPoint=this.endPoint.toString();
        String data= "("+strStartPoint + "),( "+ strEndPoint + ") , \n"+ this.color;
        return data;
    }
 
    @Override  
    protected void finalize()   
    {   
        //this method is automatically called before object removed from heap
        System.out.println("finalize method called");   
    }

	
}
