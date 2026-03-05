package gestioncuentas;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta() {
        saldo = 0;
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

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
