package MultiInterface2;

public class Transaction implements Debitable,Creditable {

	@Override
	public void Deposit() {
		System.out.println("Amount is Added into Shoppers Account");
		
	}

	@Override
	public void Withdraw() {
		System.out.println("Amount is withdrwn from consumers shoppers account");
		
	}
	
	

}
