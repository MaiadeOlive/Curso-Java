package entities;

public class PessoaFisica extends Pessoa {

	private Double medicalBills;

	public PessoaFisica(String name, Double rendaAnual, Double medicalBills) {
		super(name, rendaAnual);
		this.medicalBills = medicalBills;
	}

	public Double getMedicalBills() {
		return medicalBills;
	}

	public void setMedicalBills(Double medicalBills) {
		this.medicalBills = medicalBills;
	}

	@Override
	public double totalTaxes() {
		Double total = 0.0;

		if (medicalBills > 0) {
			if (getRendaAnual() < 20000.00) {
				total = (getRendaAnual() * 0.15) - (medicalBills * 0.5);
			} else if (getRendaAnual() >= 20000.00) {
				total = getRendaAnual() * 0.25 - (medicalBills * 0.5);
			} else {
				if (getRendaAnual() < 20000.00) {
					total = (getRendaAnual() * 0.15);
				} else if (getRendaAnual() >= 20000.00) {
					total = getRendaAnual() * 0.25;
				}
			}
		} return total;
	}
}
