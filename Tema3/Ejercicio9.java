public class Ejercicio9{
    public static void main(String[] args) {
        final double PI = Math.PI;
        double volumen, radio, altura;
        System.out.print("Introduzca el valor del radio : ");
        radio = Double.parseDouble( System.console().readLine() );
        System.out.print("Introduzca el valor de la altura: ");
        altura = Double.parseDouble( System.console().readLine() );
        Volumen = (1.0 / 3.0) * PI * (radio * radio) * altura;
        System.out.println("El valor del volumen es : " + volumen);
    }
}