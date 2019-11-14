import java.util.Scanner;
public class T7Ejercicio14 {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que pida 8 palabras y las almacene en un array. A
		 * continuación, las palabras correspondientes a colores se deben almacenar al
		 * comienzo y las que no son colores a continuación. Puedes utilizar tantos
		 * arrays auxiliares como quieras. Los colores que conoce el programa deben
		 * estar en otro array y son los siguientes: verde, rojo, azul, amarillo,
		 * naranja, rosa, negro, blanco y morado.
		 */
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[8];
		String[] colores = {"verde", "rojo", "azul", "amarillo",
			"naranja", "rosa", "negro", "blanco", "morado"};
		String[] resultado = new String[8];
		System.out.println("Introduce una palabra: ");
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = sc.nextLine();
		}
		int contador = 0;
		int control = 7;
		for(int x=0;x<colores.length;x++) {
			for (int y = 0; y < palabras.length; y++) {
			  if (colores[x].equals(palabras[y])){
				System.out.println("El color "+colores[x]+" está repetido");
				resultado[contador] = colores[x];
				contador ++;
			  } else{
				  System.out.println("El color "+ colores[x]+" no está repetido");
				  resultado[control] = colores[x];
				  control --;



			  }				
			}
		}
	}
}
