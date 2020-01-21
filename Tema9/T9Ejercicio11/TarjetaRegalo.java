package T9Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    private int identificador;
    private double saldo;

    // Constructor
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.identificador = (int) ((Math.random() * 100000) + 100000);
    }

    public void gasta(double cantidad) {
        if (this.saldo - cantidad < 0) {
            System.out.println("Falta saldo para completar la operación.");
        } else {
            this.saldo = this.saldo - cantidad;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
        double saldoA = this.saldo;
        double saldoB = otraTarjeta.saldo;
        this.saldo = 0;
        otraTarjeta.saldo = 0;
        return new TarjetaRegalo(saldoA + saldoB);

    }

    @Override
    public String toString() {
        return "TarjetaRegalo{" +
                "identificador='" + identificador + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
