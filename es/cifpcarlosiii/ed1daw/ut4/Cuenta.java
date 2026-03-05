package gestioncuentas.es.cifpcarlosiii.ed1daw.ut4;

public class Cuenta {
    /**
     * Clase que sirve para crear una cuenta con un titular y un saldo, con un metodo para
     * mostrar los datos de la cuenta y otro para retirar de forma controlada
     * @author Daniel Perez Moreno
     * @param titular
     * @version 1.1
     */


    public Cuenta(String titular) {
        this.titular = titular;
    }

    private String titular;
    private double saldo;

    public Cuenta() {
        setSaldo(0);
    }

    public void mostrarDatos() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }

    public boolean retirarConControl(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            return true;
        } else {
            return false;
        }
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
