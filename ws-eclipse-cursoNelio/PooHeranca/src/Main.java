import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account ac = new Account(1001, "Alex" , 1000.0);
		ac.withdraw(200.0);
		System.out.println(ac.getBalance());
		
		Account ac1 = new SavingsAccount(1002, "Ana", 1000.0, 500.0);
		ac1.withdraw(200.0);
		System.out.println(ac1.getBalance());
		
		SavingsAccount ac2 = new SavingsAccount(1003, "Abu", 1000.0, 500.0);
		ac2.withdraw(200.0);
		System.out.println(ac1.getBalance());
		
		Account ac3 = new BusinessAccount(1004, "Celo", 1000.0, 500.0);
		ac3.withdraw(200.0);
		System.out.println(ac3.getBalance());
		
	}

}
