package Array;

public class ReturningArray {
	
	static int []get(){
		return new int[] {5,4,3,1,2};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
