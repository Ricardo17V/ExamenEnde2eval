/**
 * @author ricardo
 * @date 06/03/2026
 */
package exa2ende2526.enunciado;
/**
 * Clase CuentaCorriente heredada de la clase CuentaBancaria en la que se le añaden los atributos comisión e interés
 * para poder calcular el interés de dicha cuenta
 */
public class CuentaCorriente extends CuentaBancaria{
	/**
	 * @param comision es la comision de la cuenta bancaria
	 */
private double comision;
/**
 * @param interes es el interés de la cuenta bancaria
 */
private double interes;
/**
 * Constructor con 3 atributos que son titular, saldoInicial, comision
 * @param titular es el nombre de la persona titular de la cuenta bancaria
 * @param saldoInicial es el saldo inicial, sin aplicar ningún tipo de interés de la cuenta bancaria
 * @param comision es la comisión aplicada a dicha cuenta bancaria
 */
	public CuentaCorriente(String titular, double saldoInicial, double comision) {
		super(titular, saldoInicial);
		
	}
	/**
	 * Método heredado de la clase padre que calcula el interés de la cuentaa bancaria, el interés en la 
	 * cuenta corriente es la comisión
	 */
	@Override
	public double calcularInteres(double saldo) throws Exception {
		interes = comision;
		return interes;
	}
	@Override
	public double calcularInteres1(double saldo) throws Exception {
		
		return 0;
	}
	@Override
	public double calcularInteres11(double saldo) throws Exception {
		
		return 0;
	}

}
