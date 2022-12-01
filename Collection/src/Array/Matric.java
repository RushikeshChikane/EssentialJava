package Array;
import java.util.*;
public class Matric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	  /*  int a[][]={{4,5,6},{5,9,8}};
	    
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<3;j++) {
	    		System.out.print(a[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
		*/
		
		int [][]source= {
				{1,2,3,4},
				{5,6},
				{0,2,42,-4,5}
		};
		
		int[][] destination=new int[source.length][];
		
		for(int i=0;i<destination.length;++i) {
			
			destination[i]=new int[source[i].length];	
		
        for (int j = 0; j < destination[i].length; ++j) {
            destination[i][j] = source[i][j];


		}
	
		System.out.println(Arrays.deepToString(destination));

	}
	}
}
