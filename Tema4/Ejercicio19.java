public class Ejercicio19 {
    public static void main(String[] args) {
        //muestra la cantidad de cifras que tiene el número de hasta 5 cifras que le introduzcas
        System.out.println("Introduce un número de hasta 5 cifras: ");
        int numero = Integer.parseInt(System.console().readLine());
        //Números positivos
        if (numero < 10 && numero > 0){
            System.out.println("Tu número tiene una cifra");
        }
        if (numero >= 10 && numero < 100){
            System.out.println("Tu número tiene dos cifras");
        }
        if (numero >= 100 && numero < 1000){
            System.out.println("Tu número tiene tres cifras");
        }
        if (numero >= 1000 && numero < 10000){
            System.out.println("Tu número tiene cuatro cifras");
        }
        if (numero >= 10000 && numero < 100000){
            System.out.println("Tu número tiene cinco cifras");
        }
        if (numero > 10000){
            System.out.println("Estás introduciendo un número demasiado largo");
        }

        //Números negativos
        if (numero > -10 && numero < 0){
            System.out.println("Tu número tiene una cifra");
        }
        if (numero <= -10 && numero > -100){
            System.out.println("Tu número tiene dos cifras ");
        }
        if (numero <= -100 && numero > -1000){
            System.out.println("Tu número tiene tres cifras ");
        }
        if (numero <= -1000 && numero > -10000){
            System.out.println("Tu número tiene cuatro cifras ");
        }
        if (numero <= -10000 && numero > -100000){
            System.out.println("Tu número tiene cinco cifras ");
        }
        if (numero < -10000) {
            System.out.println("Estás introduciendo un número demasiado largo");
        }







    }
}