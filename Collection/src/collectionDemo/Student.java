package collectionDemo;

public class Student {
	
    public int id ;
    public String Name ;
    public String Date;
    public String BirthDate;
    public String  Location ;
    
    public Student(int id, String name,String Date, String BirthDate,String Location ) {
    	
    	this.id=id;
    	this.Name=name;
    	this.Date=Date;
    	this.BirthDate=BirthDate;
    	this.Location=Location;
    }	
		public void sowData() {
			System.out.println(" "+id+" "+Name+" "+Date+" "+BirthDate+" "+Location);
			System.out.println();

		}
    
	}


