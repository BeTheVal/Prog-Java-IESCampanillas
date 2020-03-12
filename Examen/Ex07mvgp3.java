import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Autor: Miguel Valerio Gutiérrez Pardo
//Modelo B
// Fecha 10/02/2020
public class Ex07mvgp3 {

  //Poner datos
  public static void main(String[] args) {
    ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(77, 88, 99));
    ArrayList<Integer> lista3 = new ArrayList<>();

    System.out.println(mezclaListas(lista1, lista2));
    System.out.println(mezclaListas(lista2, lista1));
    System.out.println(mezclaListas(lista1, lista3));
    System.out.println(mezclaListas(lista2, lista3));
  }


  public static ArrayList<Integer> mezclaListas(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    ArrayList<Integer> resultado = new ArrayList<>();
    int contador = 0;
    while (contador != a1.size() && contador != a2.size()) {
      if (contador <= a1.size()) {
        resultado.add(a1.get(contador));
      }
      if (contador <= a2.size()) {
        resultado.add(a2.get(contador));
      }
      contador++;
    }
    return resultado;
  }
}
