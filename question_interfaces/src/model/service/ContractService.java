package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;


public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		double calc1 = contract.getTotalValue() / months;
	
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(calc1, i);
			double fee = onlinePaymentService.paymentFee(calc1 + interest);
			double total = calc1 + interest + fee;
			contract.getInstallment().add(new Installment(dueDate, total));
		}
		
	}
}
