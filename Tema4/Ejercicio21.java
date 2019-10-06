public class Ejercicio21{
    public static void main(String[] args) {
        
        System.out.println("Introduce la nota del primer control: ");
        double notaPrimera = Double.parseDouble((System.console().readLine()));
        
        System.out.println("Introduce la nota del segundo contro: ");
        double notaSegunda = Double.parseDouble((System.console().readLine()));
        double media = (notaPrimera + notaSegunda) /2;
        String confirmacion = "";
        if (media > 5){
            System.out.println("Tu nota de programación es " + media);
        }
        if (media < 5 ){
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            confirmacion = System.console().readLine();
            if (confirmacion.equals ("apto")){
                System.out.println("Estás aprobado");
            } else {
                System.out.println("Estás suspenso");
            }
        }
            
        }
    }
