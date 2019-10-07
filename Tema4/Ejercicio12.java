public class Ejercicio12 {
    public static void main(String[] args) {
        // Minicuestionario
        int puntuacion = 0;
        
        System.out.println("1º Pregunta");
        System.out.println("¿Qué es Eclipse?");
        System.out.println("A . Es un fenómeno en el que la luz procedente de un cuerpo celeste es bloqueada por otro ");
        System.out.println("B. Una versión de Java especial para Android");
        System.out.println("C. Un entorno de desarrollo de aplicaciones");
        String respuesta1 = System.console().readLine();
        if (respuesta1 == "c") {
            puntuacion ++;
        } else {
            puntuacion --;
        }
        System.out.println("2ª Pregunta");
        System.out.println("¿Que es el Bytecode en Java?");
        System.out.println("A .El formato de intercambio de datos");
        System.out.println("B. El formato que obtenemos tras compilar .java");
        System.out.println("C. Un tipo de variable"); 
        System.out.println("D. Un depurador de codigo");
        String respuesta2 = System.console().readLine() ;
        if (respuesta2 == "a") {
            puntuacion ++;
        } else {
            puntuacion --;
        System.out.println("3ª Pregunta"); 
        System.out.println("¿Cuál de estos bucles NO existe en C ni en Java? "); 
        System.out.println("A. while"); 
        System.out.println("B. repeat"); 
        System.out.println("C. do while"); 
        System.out.println("D. for");
        String respuesta3 = System.console().readLine() ;
        if (respuesta3 == "b") {
            puntuacion ++;
        } else {
            puntuacion --;
        System.out.println("4ª Pregunta"); 
        System.out.println("¿En Java cuál de estos tipos de variable ocupa más espacio en la memoria?"); 
        System.out.println("A. byte"); 
        System.out.println("B. boolean"); 
        System.out.println("C. char"); 
        System.out.println("D. int"); 
        String respuesta4 = System.console().readLine();
        if (respuesta4 == "a") {
            puntuacion ++;
        } else {
            puntuacion --;
                 }
                 System.out.println("Su puntuación es "+ puntuacion + "de 4");
            }
        }
    }
}