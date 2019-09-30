public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduce un número del 1 al 7 y te diré a que día corresponde : ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero == 1){
            System.out.println("Corresponde al lunes");
        }
        if (numero == 2){
            System.out.println("Corresponde  al martes");
        }
        if (numero == 3){
            System.out.println("Corresponde al miércoles");
        }
        if (numero == 4){
            System.out.println("Corresponde el jueves");
        }
        if (numero == 5){
            System.out.print("Corresponde el viernes");
        }
        if (numero == 6){
            System.out.println("Corresponde el sábado");
        }
        if (numero == 7){
            System.out.println("Corresponde el domingo");
        }
    }
}