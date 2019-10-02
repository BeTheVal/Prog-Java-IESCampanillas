public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Te digo la asignatura que tienes a primera hora");
        System.out.print("¿Que día es Hoy? : ");
        String respuesta = System.console().readLine().toLowerCase();
        
        switch(respuesta){
            default:
            System.out.println("Introduzca el día correcto");
            case "lunes":
            case "miercoles":
            case "miércoles":
            case "jueves":
                System.out.println("Tienes Programación");
                break;
            case "martes":
                System.out.println("Tienes entornos de desarrollo");
                break;
            case "viernes":
                System.out.println("Tienes sistemas informáticos");
                break;
        }       
    }
}