package gestioncuentas;
/**
 * Clase que representa una cuenta bancaria.
 * author: Pedro Viñals
 * version: 1.2
 */
public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
        saldo = 0;
    }

    /**
     * Muestra los datos de la cuenta.
     *
     */
    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @return true si la retirada es exitosa, false en caso contrario.
     */
    public boolean retirarConControl(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
