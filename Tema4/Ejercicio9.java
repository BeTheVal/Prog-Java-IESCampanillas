// Realiza un programa que resuelva una ecuación de segundo grado (del tipo
// ax 2 + bx + c = 0 ).
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Ingrese a: ");
        double a = Double.parseDouble( System.console().readLine());
        System.out.print("Ingrese b: ");
        double b = Double.parseDouble( System.console().readLine());
        System.out.print("Ingrese c: ");
        double c = Double.parseDouble( System.console().readLine());
        double auxiliar = (b*b) - (4* a*c);
        //Calculo
        double primerResultado = (-b + Math.sqrt(auxiliar)) / (2*a);
        double segundoResultado = (-b - Math.sqrt(auxiliar)) / (2*a);

        if (auxiliar == (-auxiliar)){
            System.out.println("Esta operación no tiene resultado");
        } else {
            System.out.printf("Los resultados son: %.2f y %.2f\n" , primerResultado , segundoResultado);
        }
    }
}