package ComparatorMethod;
import java.util.*;
import java.io.*;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		System.out.println("Sorting by name");
		//using NameComparator to sort the element
		Collections.sort(al,new NameComparator());
		
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age );
		}
		
		
		System.out.println("\nSorting by age");
		
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		 
		
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

	}

}
