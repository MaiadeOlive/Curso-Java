package model.services;

public class PaypalService implements OnlinePaymentService{

	public Double paymentFee(Double amount){
		return amount / 100 * 2;
	}

	public Double interest(Double amount, Integer months){

		return (amount / 100 * 1) * months;
	}
}
