package T9Ejercicio6;

public class T9ejercicio6 {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 30, 25);
        Tiempo t2 = new Tiempo(1, 30, 20);
        t1.suma(t2);
        System.out.println(t1.toString());
        t1.resta(t2);
        System.out.println(t1.toString());
    }
}
