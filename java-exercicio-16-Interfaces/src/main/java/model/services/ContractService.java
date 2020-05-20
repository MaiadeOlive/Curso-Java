package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	private Date addMonths(Date date, int n){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	public void processContract(Contract contract, Integer months){
		double basicPayPart = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++){
			Date date = addMonths(contract.getDate(), i);
			double updatedPayPart = basicPayPart + onlinePaymentService.interest(basicPayPart, i);
			double totalPayment = updatedPayPart + onlinePaymentService.paymentFee(updatedPayPart);
			contract.addInstallment(new Installment(date, totalPayment));
		}
	}
}
