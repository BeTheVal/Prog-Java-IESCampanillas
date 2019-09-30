public class Ejercicio6 {
    public static void main(String[] args) {
        // Calcula el area de un triangulo 
        double base, altura, area;
        System.out.print("Inserte el valor de la base: ");
        base = Double.parseDouble( System.console().readLine() );
        System.out.print("Inserte el valor de la altura: ");
        altura = Double.parseDouble( System.console().readLine() );
        area = (base * altura) / 2;
        System.out.println("El Valor del área es : " + area);
    }
}