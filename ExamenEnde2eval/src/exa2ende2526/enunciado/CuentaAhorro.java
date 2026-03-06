package exa2ende2526.enunciado;

public class CuentaAhorro extends CuentaBancaria{
	private double interes;
	private double tasaInteres;
	public CuentaAhorro(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		
	}
	@Override
	public double calcularInteres(double saldo) throws Exception {
		double interes = saldo * tasaInteres;
		return interes;
	}

}
