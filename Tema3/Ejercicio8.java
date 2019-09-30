public class Ejercicio8 {
    public static void main(String[] args) {
        double salariobrutomes, salariobrutodia, salariobrutohora, salariobruto12horas;
        System.out.print("Introduzca el Salario Bruto mensual : ");
        salariobrutomes = Double.parseDouble( System.console().readLine() );
        salariobrutodia = (salariobrutomes / 30);
        salariobrutohora = (salariobrutodia / 8);
        salariobruto12horas = (salariobrutohora * 12);
        System.out.println("Salario por 12 horas : " + salariobruto12horas);

    }
}