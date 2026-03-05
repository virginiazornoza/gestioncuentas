package gestioncuentas;

public class CuentaCorriente extends Cuenta {

    private double comision;

    public CuentaCorriente() {
        comision = 2.0;
    }

    public void aplicarComision() {
        setSaldo(getSaldo() - comision);
    }

    private double getComision() {
        return comision;
    }

    private void setComision(double comision) {
        this.comision = comision;
    }
}