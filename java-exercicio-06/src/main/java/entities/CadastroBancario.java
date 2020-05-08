package entities;

public class CadastroBancario {

	private int numero_conta;
	private String nome_titular;
	private double saldo;

	public CadastroBancario(int numero_conta, String nome_titular) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;
	}
	public CadastroBancario(int numero_conta, String nome_titular, double depositoInicial) {
		this.numero_conta = numero_conta;
		this.nome_titular = nome_titular;
		deposit(depositoInicial);
	}
	public int getNumero_conta(){
		return numero_conta;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public void deposit(double value){
		this.saldo += value;
	}

	public void withdraw(double value){
		this.saldo -= value + 5.00;
	}

	public String toString() {
		return "Account "
				+ numero_conta
				+ ", Holder: "
				+ nome_titular
				+ ", Balance: R$"
				+ String.format("%.2f", saldo);
	}
}