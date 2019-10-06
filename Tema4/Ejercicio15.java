public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide en pantalla");
        System.out.print("Introduce el carácter de relleno: ");
        String i = System.console().readLine();
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia la derecha");
        System.out.println("3. Con el vértice hacia abajo");
        System.out.println("4. Con el vértice hacia la izquierda");
        int opcion = Integer.parseInt( System.console().readLine());
        switch(opcion){
            case 1:
            System.out.println("  " + i);
            System.out.println(" " + i + i + i);
            System.out.println(i + i + i + i + i);
            break;
            case 2:
            System.out.println(i);
            System.out.println(i + " " + i);
            System.out.println(i + " " + i + " " + i);
            System.out.println(i + " " + i);
            System.out.println(i);
            break;
            case 3:
            System.out.println(i + i + i + i + i);
            System.out.println(" " + i + i + i);
            System.out.println("  " + i);
            break;
            case 4:
            System.out.println("    " + i);
            System.out.println("  " + i + " " + i);
            System.out.println(i + " " + i + " " + i);
            System.out.println("  " + i + " " + i);
            System.out.println("    " + i);
        }

        
    }
}