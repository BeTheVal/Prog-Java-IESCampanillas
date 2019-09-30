public class Ejercicio12 {
    public static void main(String[] args) {
     double notaprimerexamen, notasegundoexamen, notatrimestre;
     System.out.print("Inserte la nota del primer trimestre :");
     notaprimerexamen = Double.parseDouble(System.console().readLine());
     System.out.print("Inserte la nota trimestral deseada: ");
     notatrimestre = Double.parseDouble(System.console().readLine());
     //notatrimestre = 40/100 * notaprimerexamen + 60/100 * notasegundoexamen
     //notasegundoexamen = 10*notatrimestre = 4* notaprimerexamen
     notasegundoexamen = ((5*notatrimestre) - (2*notaprimerexamen))/3;
     System.out.print("Nota segundo exámen :" + notasegundoexamen);
    }
}