
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Autor: Miguel Valerio Gutiérrez Pardo
//Modelo B
// Fecha 10/02/2020
public class Ex07mvgp2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> españolIngles = new HashMap<>();
    españolIngles.put("hola", "hello");
    españolIngles.put("casa", "house");
    españolIngles.put("caballo", "horse");
    españolIngles.put("manzana", "apple");
    españolIngles.put("agua", "water");
    españolIngles.put("frambuesa", "raspberry");
    españolIngles.put("amarillo", "yellow");
    españolIngles.put("azul", "blue");
    String nombreesp = "";
    String valoring = " ";
    ArrayList<String> llaves = new ArrayList<>();
    for (String s : españolIngles.keySet()) {
      llaves.add(s);
    }
    ArrayList<String> valores = new ArrayList<>();
    for (String value : españolIngles.values()) {
      valores.add(value);
    }
    int acierto = 0;
    for (int i = 0; i < 5; i++) {
      String pregunta = llaves.get((int) (Math.random() * 8));
      String pregunta2 = valores.get((int) (Math.random() * 8));
      System.out.println(pregunta + " is " + pregunta2 + "? Answer (y/n):");
      String respuesta = sc.next();
      if (respuesta.equals("s") && españolIngles.get(pregunta).equals(pregunta2)) {
        acierto++;
      }
    }
    System.out.println("aciertos = " + acierto);
  }
}
