import entities.Account;
import entities.BusinessAccount;

public class Main {

	public static void main(String[] args) {

		Account ac = new Account(1, "Guina", 1000.0);
		BusinessAccount ba1 = new BusinessAccount();
		
		System.out.println(ac);
	}

}
