public class Ejercicio7{
    public static void main(String[] args) {
        final int iva = 21;
        double baseimp, totaliva, total;
        System.out.print("Inserte Base Imponible en euros: ");
        baseimp = Double.parseDouble( System.console().readLine() );
        totaliva = (baseimp * iva) /100;
        total = (totaliva + baseimp);
        System.out.printf("La Base imponible %10.2f Euros\n",baseimp);
        System.out.printf("Iva               %10.2f Euros\n",totaliva);
        System.out.printf("total               %10.2f Euros\n",total);
    }
}