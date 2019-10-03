public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Inserte la primera nota: ");
        double primeraNota = Double.parseDouble( System.console().readLine());
        System.out.println("Inserte la segunda nota: ");
        double segundaNota = Double.parseDouble( System.console().readLine());
        System.out.println("Inserte la tercera nota: ");
        double terceraNota = Double.parseDouble( System.console().readLine());
        //Media de la nota
        double media = ((primeraNota+segundaNota+terceraNota)/3);
        System.out.println("Tu media es de: " + media);
    }
}