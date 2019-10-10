public class T5Ejercicio7 {
    public static void main(String[] args) {
        int intentosMaximos = 4;
        int combinacion = 1234;
        System.out.println("Bienvenido a la caja fuerte");
        do {
            System.out.println("Introduzca la clave para entrar(4 cifras):");
            int clave = Integer.parseInt( System.console().readLine());
            if (combinacion == clave) {
                System.out.println("La clave introducida es correcta");
                intentosMaximos = 0;
            } else {
                System.out.println("La clave introducida es incorrecta");
                intentosMaximos -= 1;
            }
        } while (intentosMaximos > 0);
    }
}