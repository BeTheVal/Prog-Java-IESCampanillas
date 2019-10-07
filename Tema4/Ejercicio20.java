public class Ejercicio20 {
    public static void main(String[] args){
        int numero;
        boolean esCapicua = false;
        
        System.out.print("Por favor, introduzca un número entero de hasta 5 : ");
        numero = Integer.parseInt(System.console().readLine());
        if (numero < 10) {
            esCapicua = true;
        }
        if ((numero >= 10) && (numero < 100)) {
            if ((numero / 10) == (numero % 10)) {
            esCapicua = true;
            }
        }
        if ((numero >= 100) && (numero < 1000)) {
            if ((numero / 100) == (numero % 10)) {
            esCapicua = true;
            }
        }
        if ((numero >= 1000) && (numero < 10000)) {
            if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10) == (( numero / 10) % 10))) {
            esCapicua = true;
            }
        }
        if (numero >= 10000) {
            if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
            esCapicua = true;
            }
        }
        if (esCapicua) {
            System.out.println("El número introducido es capicúa.");
        } else {
            System.out.println("El número introducido no es capicúa.");
        }
        }
    }
