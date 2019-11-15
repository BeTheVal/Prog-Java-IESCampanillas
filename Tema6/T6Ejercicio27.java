import java.util.Scanner;

import javax.lang.model.util.ElementFilter;
public class T6Ejercicio27 {
    public static void main(String[] args) {
        /*Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
         *jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
         *introduce una opción incorrecta, el programa deberá mostrar un mensaje de
         *error. */
        Scanner sc = new Scanner(System.in);
        String jugada;
        boolean salida = false;
        
        // Turno del jugador

        do {
        System.out.println("Turno del jugador (Introduce Piedra, Papel o Tijera): ");
        jugada = sc.nextLine().toLowerCase();
        if (jugada.equals("piedra")|| jugada.equals("papel")|| jugada.equals("tijera")) {
            salida = true;
        }else{
            System.out.println("Ha introducido una figura correcta.");
        }
        } while (!salida);
        sc.close();

        //Turno de la máquina

        int tiradaMaquina = (int) (Math.random() * 3);
        switch (tiradaMaquina) {
            case 0:
            System.out.println("Piedra");
            if (jugada.equals("papel")) {
                System.out.println("He Perdido");
            } else if (jugada.equals("tijera")){
                System.out.println("Yo gano");
            }else{
                System.out.println("Hemos empatado");
            }
            break;
            
            case 1:
            System.out.println("Papel");
            if (jugada.equals("tijera")) {
                System.out.println("He Perdido");
            } else if (jugada.equals("piedra")){
                System.out.println("Yo gano");
            }else{
                System.out.println("Hemos empatado");
            }
            break;

            case 2:
            System.out.println("Tijera");
            if (jugada.equals("piedra")) {
                System.out.println("He Perdido");
            } else if (jugada.equals("papel")){
                System.out.println("Yo gano");
            }else{
                System.out.println("Hemos empatado");
            }
            break;
        
            default:
                break;
        }

    }
}