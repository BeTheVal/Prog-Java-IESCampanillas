public class Ejercicio16{
    public static void main(String[] args) {
        int puntuacion = 0 ;
        System.out.println("Test de infidelidad: Responde verdadero o falso a las siguientes cuestiones");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String respuesta = System.console().readLine();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
            System.out.println("puntos: " + puntuacion);
        }
        System.out.println("Ha aumentado sus gastos de vestuario");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = System.console().readLine();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
            System.out.println("puntuacion: "+ puntuacion);
        }
        System.out.println("No te deja que mires la agenda de su teléfono móvil");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Has notado que últimamente se perfuma más");
        respuesta = System.console().readLine().toLowerCase();
         if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        respuesta = System.console().readLine().toLowerCase();
        if (respuesta == "v" || respuesta == "verdadero"){
            puntuacion = (puntuacion + 3);
        }
    }
}