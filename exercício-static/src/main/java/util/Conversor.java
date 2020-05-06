package util;

public class Conversor {

	public static double conversaoDolar(double quantidadeDolares, double dolar_price){
		double total = (quantidadeDolares * dolar_price) + (quantidadeDolares * dolar_price) * 0.06;
		return total;
	}
}