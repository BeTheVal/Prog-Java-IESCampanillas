public class T6Ejercicio7 {
    public static void main(String[] args) {

        /*
        Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
        para los 14 partidos y el pleno al quince (15 filas).
        */
        //Para los 14 partidos
        for (int i = 1; i < 15; i++) {
            int numero = (int)(Math.random()* 3);
            System.out.println(i + " . " + numero);
        }
        //Pleno al 15
        int Pleno15EquipoA = (int)(Math.random()* 4);
        int Pleno15EquipoB = (int)(Math.random()* 4);
        if (Pleno15EquipoA == 3) {
            System.out.print("15. M , ");
        } else {
        System.out.print("15. "+ Pleno15EquipoA + " , ");
        }
        if (Pleno15EquipoB == 3) {
            System.out.print("M");
        }else{
            System.out.println(Pleno15EquipoB);
        }
    }
}