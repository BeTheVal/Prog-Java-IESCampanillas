public class T5Ejercicio1 {
    public static void main(String[] args) {
        //Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
        for ( int i = 5 ; i < 100; i +=5 ) {
            System.out.println(i);
            if (i > 100){
            break;
            }
        }
    }
}