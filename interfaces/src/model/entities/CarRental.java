package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private LocalDateTime star;
	private LocalDateTime finish;
	
	private Vehicle vahicle;
	private Invoice invoice;
	
	public CarRental() {
	
	}

	public CarRental(LocalDateTime star, LocalDateTime finish, Vehicle vahicle) {
		this.star = star;
		this.finish = finish;
		this.vahicle = vahicle;
	}

	public LocalDateTime getStar() {
		return star;
	}

	public void setStar(LocalDateTime star) {
		this.star = star;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVahicle() {
		return vahicle;
	}

	public void setVahicle(Vehicle vahicle) {
		this.vahicle = vahicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
