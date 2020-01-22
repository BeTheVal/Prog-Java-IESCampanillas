package T9Ejercicio13;

public class CuentaCorriente {
    private long numerodecuenta;
    private long saldo;

    public CuentaCorriente(long saldo) {
        this.saldo = saldo;
        this.numerodecuenta = (int) ((Math.random() * 100000) + 1000000);
    }

    public CuentaCorriente() {
        this.saldo = 0;
        this.numerodecuenta = (int) ((Math.random() * 100000) + 1000000);
    }

    public void cargo(long cantidad) {
        this.saldo -= cantidad;

    }

    public void ingreso(long cantidad) {
        this.saldo += cantidad;

    }

    public void transferencia(CuentaCorriente otraCuenta, long cantidad) {
        this.saldo -= cantidad;
        otraCuenta.saldo += cantidad;

    }

    @Override
    public String toString() {
        return "Número CC " + this.numerodecuenta + " saldo: " + this.saldo;
    }
}
