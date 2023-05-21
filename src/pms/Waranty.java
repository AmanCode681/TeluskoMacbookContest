package pms;

import java.time.LocalDate;

public class Waranty {

	private LocalDate date;

	public Waranty(LocalDate date) {
		this.date = date;
	}




	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Waranty [date=" + date + "]";
	}
	
}
