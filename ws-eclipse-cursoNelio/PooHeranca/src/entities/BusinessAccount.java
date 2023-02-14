package entities;

public class BusinessAccount extends Account{

	private Double loanLimite;//Limite de emprestimo
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public void loan(Double amount) {
		if (amount <= loanLimite) {
			deposit(amount);
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
