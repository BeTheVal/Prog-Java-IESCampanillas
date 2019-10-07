public class Ejercicio6 {
    public static void main(String[] args) {
        final double GRAVEDAD = 9.81;
        System.out.println("Introduce la altura en metros: ");
        double altura = Double.parseDouble( System.console().readLine());
        double auxiliar =  (2 * altura) / GRAVEDAD;
        double tiempo = Math.sqrt(auxiliar);
        System.out.printf("El resultado es %.2f segundos", tiempo);
    }
}