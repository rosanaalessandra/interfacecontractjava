package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/mm/yyyy");
	

	private Double amount;

	private LocalDate dueDate;
	
	
	public Installment (LocalDate dueDate, Double amount) {
		
	    this.dueDate = dueDate;
		this.amount = amount;
	}
	

	public LocalDate getDate() {
		return dueDate;
	}


	public void setDate(LocalDate date) {
		this.dueDate = dueDate;
	}


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
