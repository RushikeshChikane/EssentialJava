package ComparatorMethod;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ArrayList <Employee> el=new ArrayList<Employee>();
		
		el.add(new Employee(4,"Rushi",1500));
		el.add(new Employee(1,"Abhi",1100));
		el.add(new Employee(2,"Vijay",1800));
		
		System.out.println("Sorting By salary");
		Collections.sort(el, new EmpComparar());
		
		for(Employee st:el) {
			System.out.println(st.id+" "+st.name+" "+st.salary );
		}
		

	}

}
