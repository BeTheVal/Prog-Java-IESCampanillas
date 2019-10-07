    public class Ejercicio8 {
    public static void main(String[] args) {
    System.out.print("Inserte la primera nota: ");
    double primeraNota = Double.parseDouble( System.console().readLine());
    System.out.print("Inserte la segunda nota: ");
    double segundaNota = Double.parseDouble( System.console().readLine());
    System.out.print("Inserte la tercera nota: ");
    double terceraNota = Double.parseDouble( System.console().readLine());
    //Media de la nota
    double media = ((primeraNota+segundaNota+terceraNota) / 3);
    System.out.printf("Tu media es de : %5.2f\n", media);

    if (media < 5.0) {
        System.out.println("Insuficiente");
    } else if (media  < 6.0) {
        System.out.println("Suficiente");
    } else if(media < 7) {
        System.out.println("Bien");
    } else if(media < 9) {
        System.out.println("notable");
    } else if(media < 10) {
        System.out.println("sobresaliente");
    } else {
        System.out.println ("Tu media no está en la media ... :)");
    }
    }
    }