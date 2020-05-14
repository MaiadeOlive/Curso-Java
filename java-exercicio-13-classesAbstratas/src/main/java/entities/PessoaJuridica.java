package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numFuncionarios;

	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double totalTaxes() {
		Double total = 0.0;

		if (numFuncionarios > 10) {
			total = (getRendaAnual() * 0.14);
		}
		else {
			total = (getRendaAnual() * 0.16);
		} return total;
	}
}

