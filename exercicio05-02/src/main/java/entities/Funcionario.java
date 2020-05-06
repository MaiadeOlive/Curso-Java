package entities;

public class Funcionario {

	public String name;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido(){
		return salarioBruto - imposto;
	}
	public void aumentoSalario(double porcentagem){
		salarioBruto += salarioBruto * porcentagem / 100.00;
	}
	public String toString() {
		return name + ", $" + String.format("%.2f", salarioLiquido());
	}

}

