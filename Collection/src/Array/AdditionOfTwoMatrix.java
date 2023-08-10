package Array;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int a[][] = {{9,5,3},
				     {4,5,6}};
		int b[][] = {{9,8,7},
				     {1,5,2}};
		int c[][]=new int[2][3];
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
		
				}

}
