package exa2ende2526.enunciado;
/**
 * @author ricardo
 * @date 06/03/2026
 */

/**
 * Clase padre CuentaBancaria de las que sus hijas heredaran sus atributos y su método abstracto calcularIntereses,
 * posee también los métodos ingresar, reintegrar
 */
public abstract class CuentaBancaria {
	/**
	 * @param titular es el nombre del titular de la cuenta bancaria
	 */
    protected String titular;
    /**
     * @param saldo es el saldo que posee la cuenta bancaria
     */
    protected double saldo;
    /**
     * Constructor con los atributos titular y saldoInicial que en caso de tener saldo inicial negativo lanza una excepción
     * @param titular es el nombre del titular de la cuenta bancaria 
     * @param saldoInicial es el saldo que inicialmente posee una cuenta bancaria
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    /**
     * Método que calcula los intereses de una cuenta bancaria
     * @param saldo es el saldo que posee la cuenta bancaria
     * @return devuelve el interés calculado
     * @throws lanza una excepción, aún no implementada
     */
    public abstract double calcularInteres(double saldo) throws Exception;
    /**
     * Método para obtener el nombre del titular de la cuenta
     * @return devuelve el nombre del titular
     */
    public String getTitular() {
        return titular;
    }
    /**
     * Método para obtener el salario de la cuenta
     * @return devuelve el valor del salario de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método para ingresar cierta cantidad a la cuenta
     * @param cantidad
     */
    public void ingresar(double cantidad) {

        saldo += cantidad;
    }
    /**
     * Método para reintegrar cierta cantidad de la cuenta
     * @param cantidad
     */
    public void reintegrar(double cantidad) {

        saldo -= cantidad;
    }
    
    
}
