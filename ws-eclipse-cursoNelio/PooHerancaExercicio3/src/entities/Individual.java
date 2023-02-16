package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public Double healthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public double tax() {
		double tax;

		if (getAnnualIncome() < 20000.00) {
			tax = (getAnnualIncome() * 0.15);
		} else {
			tax = (getAnnualIncome() * 0.25);
		}

		if (getHealthExpenditures() != 0.0) {
			tax = tax - (getHealthExpenditures() / 2);

		}
		return tax;
	}
}
