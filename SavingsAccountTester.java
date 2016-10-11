
public class SavingsAccountTester {
	public static void main(String [ ] args ){
		SavingsAccount myAccount = new SavingsAccount(1000, "Justin", 10);
		myAccount.addInterest();
		System.out.println("Expected result " + 1100);
		System.out.println(myAccount.balance);
}	
}
