import java.util.ArrayList;

public class T10Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int cantidadNumerosEnLista = (int) ((Math.random() * 10) + 10);
        int mayor = 0;
        int menor = 100;

        for (int i = 0; i < cantidadNumerosEnLista; i++) {
            numeros.add((int) (Math.random() * 100));
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }

            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        long suma = 0;
        for (Integer numero : numeros) {
            suma += numero;

        }
        System.out.println("La sumas de los números es: " + suma);
        System.out.println("La media de los números es: " + suma / cantidadNumerosEnLista);
        System.out.println("El menor es : " + menor);
        System.out.println("El mayor es : " + mayor);
    }
}
