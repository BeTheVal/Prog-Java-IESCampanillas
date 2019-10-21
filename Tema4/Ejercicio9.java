// Realiza un programa que resuelva una ecuación de segundo grado (del tipo
// ax 2 + bx + c = 0 ).
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Ingrese a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese b: ");
        double b = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese c: ");
        double c = Double.parseDouble(System.console().readLine());
        if (a == 0 && b != 0 && c != 0) {
            System.out.println("La solución es %.2f", -c / b);
            double auxiliar = (b * b) - (4 * a * c);
            if (auxiliar < 0) {
                System.out.println("Esta ecuación no tiene solución real");
            } else {
                double primerResultado = (-b + Math.sqrt(auxiliar)) / (2 * a);
                double segundoResultado = (-b - Math.sqrt(auxiliar)) / (2 * a);
                System.out.printf("Los resultados son: %.2f y %.2f\n", primerResultado, segundoResultado);
            }
        }

    }
}