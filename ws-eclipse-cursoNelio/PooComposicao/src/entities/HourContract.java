package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePorHour;
	private Integer hours;

	public HourContract() {
	}

	public HourContract(Date date, Double valuePorHour, Integer hours) {
		this.date = date;
		this.valuePorHour = valuePorHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePorHour() {
		return valuePorHour;
	}

	public void setValuePorHour(Double valuePorHour) {
		this.valuePorHour = valuePorHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return valuePorHour * hours;
	}

}
