package D2dArrays;
import java.util.*;
public class eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int[] []numbers=new int[row][col];
		
		//input 
		//rows
		for(int  i=0;i<row;i++) {
			//cols
			for(int j=0;j<col;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}

}
