//dada una hora determinada (horas y minutos), calcule
//los segundos que faltan para llegar a la medianoche.
public class Ejercicio11 {
    public static void main(String[] args) {
        //Petición de datos
        System.out.println("Esta aplicación calcula los segundos que faltan hasta la media noche a partir de la hora introducida");
        System.out.println("Introduce la hora (sin los minutos):");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce los minutos");
        int minutos = Integer.parseInt(System.console().readLine());
        final int segundosEnUnDia = 86400
        //Conversiones
        int horaEnSegundos = (hora * 60) * 60;
        int minutosEnSegundos = (minutos * 60);


    }
}