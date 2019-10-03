//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Adivinaré tu horóscopo si me dices tu día de nacimiento");
        System.out.print("Introduce tu día de nacimiento: ");
        int diaNacimiento = Integer.parseInt( System.console().readLine());
        System.out.print("Introduce tu mes de nacimiento: ");
        String mesNacimiento = System.console().readLine().toLowerCase();

        switch (mesNacimiento){
            case "enero":
            if ((diaNacimiento => 1 && diaNacimiento <= 20)){
                System.out.print("Eres Capricornio");
            } else if (diaNacimiento >= 20 && diaNacimiento >=31);
            case "febrero":
        }



    }
}