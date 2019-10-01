//calcula el salario semanal de un trabajador teniendo en cuenta 
//que las horas ordinarias (40 primeras horas de
//trabajo) se pagan a 12 euros la hora.
// A partir de la hora 41, se pagan a 16 euros la hora.
public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horastrabajadas = Integer.parseInt(System.console().readLine());
        int sueldosemanal;
        if (horastrabajadas < 40) {
          sueldosemanal = 12 * horastrabajadas;
        } else {
          sueldosemanal = (40 * 12) + ((horastrabajadas - 40) * 16);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldosemanal + " euros");
    }
}