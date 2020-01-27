package T9AOEjercicio5;

public class T9Ejercicio4 {
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(3, 4);
    Fraccion f2 = new Fraccion(4, 6);
    System.out.println(f1.divide(f2));
    System.out.println(f1.invierte(f2));
    System.out.println(f2.multiplica(f1));
    f2.simplifica(2);
    System.out.println(f2.toString());
  }
}
