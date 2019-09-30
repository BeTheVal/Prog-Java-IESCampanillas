public class Ejercicio11 {
    public static void main(String[] args) {
        
        final double FactorDeConversion = 0.001;
        double totalmb, valorkb;
        
        System.out.print("Introduzca los Kb a convertir : ");
        valorkb = Double.parseDouble(System.console().readLine());
        
        totalmb = (valorkb / FactorDeConversion);
        System.out.println("Total en Mb : " + totalmb);
        
    }
}