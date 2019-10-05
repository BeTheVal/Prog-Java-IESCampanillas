public class Ejercicio10 {
    public static void main(String[] args) {
    final int factordeconversion = 1000; 
    double kbaaconvertir, totalmb;
    
    System.out.print("¿Cuantos Kb quieres convertir?");
    kbaaconvertir = Double.parseDouble(System.console().readLine());
    totalmb = (kbaaconvertir * factordeconversion);
    System.out.print("Total en Mb :" + totalmb);
}
}