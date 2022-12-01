package ComparableMethodInArray;
import java.util.*;
import java.lang.*;
public class Employee implements Comparable<Employee> {
	
	private String name;
	private int empId;
	
	public Employee(String name,int empId) {
		this.name=name;
		this.empId=empId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getempId() {
		return empId;
	}
	
	//overridden funcion since we are working with array of object
	 @Override
	public String toString() {
		return "{" + "name='" + name + '\'' +
                ", EmpId=" + empId + '}';
	}
	 
	 //compareTo method overridden for sorting array of object
	 @Override
	 public int compareTo(Employee o) {
	        if (this.empId != o.getempId()) {
	            return this.empId-o.getempId();
	        }
	        return this.name.compareTo(o.getName());
	    }

	public static void main(String[] args) {
		//array of employee object
		Employee [] emp= {new Employee("Rushi",2),
				          new Employee("Rajat",5),
				          new Employee("Abhi",3),
				          new Employee("Rushikesh",1)
		};
		
		//printing original array
		System.out.println("original array of employee object");
		System.out.println(Arrays.toString(emp));
		
		//sorted array on employee object
		Arrays.sort(emp);
		//displaying sorted employee
		System.out.println("\n Sorted Array of Employees object ");
		System.out.println(Arrays.toString(emp));

	}

}
