import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING, como a subclasse É UMA conta da super ele aceita...
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		//Fazendo o casting ele funciona
		BusinessAccount acc4 = (BusinessAccount) acc2;
		//Compilador sugeriu transformar em BusinessAccount pois criei acc3 como Account...dai ele aceita aqui mas dá erro em tempo de execução
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//Eu mesmo tenho que usar condicionais para garantir qual tipo de objeto é..INSTANCEOF é utilizado para isso
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
