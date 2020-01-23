package T9Ejercicio15;

//TODO Terminar el ejercicio.
public class T9Ejercicio15 {
    public static void main(String[] args) {
        int contadorobj = 0;
        do {
            int a = (int) (Math.random() * 9);
            int b = (int) (Math.random() * 9);
            int contadorNombre = 0;
            for (int i = 0; i < 8; i++) {
                FichaDomino = new FichaDomino(a, b);
            }
            contadorobj++;


        } while (contadorobj != 8);
    }
}
