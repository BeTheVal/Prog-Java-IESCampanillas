import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class T10Ejercicio11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("casa", "house");
    diccionario.put("toalla", "towel");
    diccionario.put("acera", "sidewalk");
    diccionario.put("boca", "mouth");
    diccionario.put("flor", "flower");
    diccionario.put("techo", "roof");
    diccionario.put("plaza", "square");
    diccionario.put("leche", "milk");
    diccionario.put("niño", "kid");
    diccionario.put("playa", "beach");
    diccionario.put("rodilla", "knee");
    diccionario.put("viento", "wind");
    diccionario.put("tenedor", "fork");
    diccionario.put("comida", "food");
    diccionario.put("enchufe", "socket");
    diccionario.put("pimiento", "pepper");
    diccionario.put("llaves", "keys");
    diccionario.put("plato", "plate");
    diccionario.put("chocolate", "chocolate");
    diccionario.put("moto", "motorcycle");
    int acierto = 0;
    int fallos = 0;
    for (String s : diccionario.keySet()) {
      System.out.println("¿Como es " + s + "en inglés?");
      String respuesta = sc.next();
      if (respuesta.equals(diccionario.get(s))) {
        acierto++;
      } else {
        fallos++;
      }
    }
    System.out.println("Aciertos : " + acierto);
    System.out.println("Fallos : " + fallos);

  }

}
