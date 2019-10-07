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
            if ((diaNacimiento >= 1 && diaNacimiento <= 20)){
                System.out.print("Eres Capricornio");
            } else if (diaNacimiento >= 21 && diaNacimiento >=31) {
                System.out.println("Eres Acuario");
            }
            break;
        case "febrero":
            if ((diaNacimiento >= 1) && (diaNacimiento <= 19)){
                System.out.print("Eres Acuario");
            } else if ((diaNacimiento >20 && diaNacimiento <29)) {
                System.out.println("Eres Piscis");
            }
            break;
        case "marzo":
            if ((diaNacimiento >= 1 && diaNacimiento <=20)) {
                System.out.print("Eres Piscis");
            } else if ((diaNacimiento <= 21 && diaNacimiento <=31)){
                System.out.println("Eres Aries");
            }
            break;
        case "abril":
            if ((diaNacimiento >= 1 && diaNacimiento >= 20)) {
                System.out.println("Ers Aries");
            } else if ((diaNacimiento >=21 &&diaNacimiento <=30)){
                System.out.println("Eres Tauro");
            }
            break;
        case "mayo":
            if (diaNacimiento >= 1 && diaNacimiento >= 21) {
                System.out.println("Eres Tauro");
            } else if ((diaNacimiento >=22 && diaNacimiento <=31)){
                System.out.println("Eres Geminis");
            }
            break;
        case "junio":
            if ((diaNacimiento >= 1 && diaNacimiento >= 21)) {
                System.out.println("Eres Geminis");
            } else if (diaNacimiento >=22 && diaNacimiento <=30){
                System.out.println("Eres Cancer");
            }
        case "julio":
            if ((diaNacimiento >= 1)&&(diaNacimiento <= 23)) {
                System.out.println("Eres Cancer");
            } else if (diaNacimiento >=24 && diaNacimiento <=31){
                System.out.println("Eres Leo");
            }
        case "agosto":
            if ((diaNacimiento >= 1 && diaNacimiento >= 23)) {
                System.out.println("Eres Leo");
            } else if (diaNacimiento >=24 && diaNacimiento <=31){
                System.out.println("Eres Virgo");
            }
            break;
        case "septiembre":
            if ((diaNacimiento >= 1)&&(diaNacimiento >= 23)) {
                System.out.println("Eres Virgo");
            } else if (diaNacimiento >=24 && diaNacimiento <=30){
                System.out.println("Eres Libra");
            }
            break;
        case "octubre":
            if ((diaNacimiento >= 1)&&(diaNacimiento >= 23)) {
                System.out.println("Ers Libra");
            } else if (diaNacimiento >=24 && diaNacimiento <=31){
                System.out.println("Eres Escorpio");
            }
            break;
        case "noviembre":
            if ((diaNacimiento >= 1)&&(diaNacimiento >= 22)) {
                System.out.println("Ers Escorpio");
            } else if (diaNacimiento >=23 && diaNacimiento <=30){
                System.out.println(" EresSagitario");
            }
            break;
        case "diciembre":
            if ((diaNacimiento >= 1 && diaNacimiento >= 20)) {
                System.out.println("Ers Aries");
            } else if (diaNacimiento >=21 && diaNacimiento <=31){
                System.out.println("Eres Capricornio");
            }
            break;
        default:
            System.out.println("Los datos introducidos no son correctos");

        }
    }
}
