public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Te digo la asignatura que tienes a primera hora");
        System.out.print("¿Que día es Hoy? : ");
        String respuesta = System.console().readLine().toLowerCase();
        
        if (respuesta.equals("lunes")) {
            System.out.println("Tienes Programación con Luis, mas te vale ser puntual");
        } else {
            ;
        }
        if (respuesta.equals("martes")) {
            System.out.println("Tienes Entornos de desarrollo con Pilar, mas te vale ser coger apuntes");

        } else {
            ;
        }
        if (respuesta.equals("miercoles")) {
        System.out.println("Tienes Programación con Luis, mas te vale ser puntual");
        } else {
            ;
        }
        if (respuesta.equals("jueves")) {
            System.out.println("Tienes Programación con Luis, mas te vale ser puntual");
        } else {
            ;
        }
        if (respuesta.equals("viernes")) {
            System.out.print("Tienes Programación con Luis, mas te vale ser puntual");
        } else {
            ;
        }

        if (respuesta.equals("sabado") || respuesta.equals("domingo")) {
            System.out.println("Creo que debes tomarte un café...");
        } else {
            ;
        }


    }
}