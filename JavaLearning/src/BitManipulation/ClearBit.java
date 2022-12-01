package BitManipulation;

public class ClearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int pos=2;
		int bitMask= 1<<pos;
		
		int newbitMask= ~(bitMask);
		int  newNumber = newbitMask & n;
		System.out.println(newNumber);

	}

}
