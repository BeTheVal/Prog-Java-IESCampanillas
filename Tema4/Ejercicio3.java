public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduce un número del 1 al 7 y te diré a que día corresponde : ");
        int numero = Integer.parseInt(System.console().readLine());

        switch (numero){
            default:
            System.out.println("No es correcto lo que has introducido");
            case 1:
            System.out.println("Corresponde al lunes");
            break;
            case 2:
            System.out.println("Corresponde  al martes");
            break;
            case 3:
            System.out.println("Corresponde al miércoles");
            break;
            case 4:
            System.out.println("Corresponde el jueves");
            break;
            case 5:
            System.out.print("Corresponde el viernes");
            break;
            case 6:
            System.out.println("Corresponde el sábado");
            break;
            case 7:
            System.out.println("Corresponde el domingo");
        }
    }
}