package Function;
import java.util.*;
public class ex4 {
//Write a function that takes in the radius as input and returns the circumference of a circle.
	public static Double getCircumferance (Double r) {
		return 2*3.14*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double r=sc.nextDouble();
		System.out.println(getCircumferance(r));

	}

}
