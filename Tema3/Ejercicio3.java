import java.text.DecimalFormat;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaración de variables
        final double factorconver = 166.38;
        double cantPesetas, resultado;
        //Asignación de variables
        System.out.print("Ingrese las pesetas a convertir : ");
        cantpesetas = Double.parseDouble( System.console().readLine() );
        //Cálculo
        resultado = (cantPesetas / factorconver);
        //Formateo e impresión
        DecimalFormat FormateadoDecimal = new DecimalFormat("#.##");
        System.out.println("El resultado es : " + FormateadoDecimal.format(resultado));

    }
}