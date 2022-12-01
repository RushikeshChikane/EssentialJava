package Array;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a[][]= {{1,2,3},
				    {1,3,4},
				    {2,4,6} 
		};
		int b[][]= {{5,1,6},
				    {2,4,6},
				    {5,7,6}
		};
		int c[][]=new int[3][3];
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
			}
				System.out.print(c[i][j]+" ");
		
		}
			System.out.println();
	}
	}
}
