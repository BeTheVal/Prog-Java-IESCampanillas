public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce la altura en metros: ");
        double altura = Double.parseDouble( System.console().readLine());
        double auxiliar = ((2*altura)/9.81);
        double tiempo = Math.sqrt(auxiliar);
        System.out.println("El resultado es: " + tiempo + "metros");
    }
}