import java.util.Scanner;

public class T7Ejercicio15 {
    public static void main(String[] args) {
        /*
         * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
         * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
         * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
         * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
         * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
         * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
         * máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la
         * primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca
         * donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
         * personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
         * mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
         * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
         * pueden romper aunque haya huecos sueltos suficientes.
         */
        Scanner sc = new Scanner(System.in);
        int mesa[] = new int[10];
        boolean lleno = false;
        int contador = 0;
        while (!lleno) {
            System.out.println("¿Cuantos son? :");
            int comensales = sc.nextInt();
            if (comensales > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + comensales
                        + " , haga grupos de 4 personas como máximo e intente de nuevo");
            }
            if (mesa[contador] == 4) {
                contador++;
            }
            mesa[contador] += comensales;
            System.out.println("Todos a la mesa: " + (contador + 1));

            if (comensales == 0 || mesa[9] == 4) {
                lleno = true;
            }
        }
        sc.close();

    }

}