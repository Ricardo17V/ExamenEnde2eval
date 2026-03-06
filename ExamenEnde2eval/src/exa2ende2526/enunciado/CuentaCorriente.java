package exa2ende2526.enunciado;

public class CuentaCorriente extends CuentaBancaria{
private double comision;
private double interes;
	public CuentaCorriente(String titular, double saldoInicial, double comision) {
		super(titular, saldoInicial);
		
	}

	@Override
	public double calcularInteres(double saldo) throws Exception {
		interes = comision;
		return interes;
	}

}
