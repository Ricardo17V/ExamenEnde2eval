/**
 * @author ricardo
 * @date 06/03/2026
 */

package exa2ende2526.enunciado;
/**
 * Clase CuentaAhorro que hereda la clase CuentaBancaria, añadiendole el interés y clase interés para 
 * poder calcular el interés
 */
public class CuentaAhorro extends CuentaBancaria{
	/**
	 * @param interes atributo interes que corresponde con el interés de dicha cuenta bancaria
	 */
	private double interes;
	/**
	 * @param tasaIntereses es el porcentaje de interes que se le aplicará al saldo para calcular su interés
	 */
	private double tasaInteres;
	/**
	 * Constructor con los atributos titular y saldoInicial
	 * @param titular es el nombre de la persona titular de dicha cuenta
	 * @param saldoInicial es el saldo de la cuenta antes de aplicarle el interés
	 */
	public CuentaAhorro(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		
	}
	/**
	 * Método abstracto heredado de la clase padre CuentaBancaria, que calcula el interés que tiene una cuienta,
	 * en el caso de CuentaAhorro el interés es la multiplicación del saldo por el porcentaje de la tasa de interés
	 */
	@Override
	public double calcularInteres(double saldo) throws Exception {
		double interes = saldo * tasaInteres;
		return interes;
	}
	@Override
	public double calcularInteres1(double saldo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calcularInteres11(double saldo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
