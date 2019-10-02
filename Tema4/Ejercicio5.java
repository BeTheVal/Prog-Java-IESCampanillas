//resuelve una ecuación de primer grado (del tipo ax+b = 0 ).
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a");
        //Asignación de variables
        double a = Double.parseDouble( System.console().readLine() );
        System.out.print("Por favor, introduzca el valor de b");
        double b = Double.parseDouble( System.console().readLine() );
        //Cálculo
        double x = (-b/a);
        System.out.println("X = " + x);
    }
}