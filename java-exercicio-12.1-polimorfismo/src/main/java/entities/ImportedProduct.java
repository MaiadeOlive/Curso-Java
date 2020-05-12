package entities;

public class ImportedProduct extends Product {

	private Double custemsFee;

	public ImportedProduct(String name, Double price, Double custemsFee) {
		super(name, price);
		this.custemsFee = custemsFee;
	}

	public Double getCustemsFee() {
		return custemsFee;
	}

	public void setCustemsFee(Double custemsFee) {
		this.custemsFee = custemsFee;
	}

	public Double totalPrice(){
		return  super.getPrice() + custemsFee;
	}

	@Override
	public String priceTag(){
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" $" + String.format("%.2f", totalPrice()));
		sb.append(" (Custom fee: $" + custemsFee + ")");
		return sb.toString();
	}
}
