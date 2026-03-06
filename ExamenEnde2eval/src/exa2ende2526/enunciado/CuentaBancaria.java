package exa2ende2526.enunciado;

public abstract class CuentaBancaria {

    protected String titular;
    protected double saldo;
    

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception{

        saldo += cantidad;
        
        if (cantidad > 0) {
			throw new Exception("La cantidad no puede ser negativa");
		}
    }

    public void reintegrar(double cantidad) throws  Exception{

        saldo -= cantidad;
        if (cantidad > 0 && saldo>cantidad) {
			throw new Exception("La cantidad no puede ser negativa ni superior al saldo");
		}
    }

}
