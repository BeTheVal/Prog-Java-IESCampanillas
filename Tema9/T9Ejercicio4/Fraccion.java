package T9Ejercicio4;

public class Fraccion {
  int numerador;
  int denominador;


  public Fraccion(int numerador, int denominador) {
    super();
    this.numerador = numerador;
    this.denominador = denominador;
  }

  double simplifica() {
    return 0.0;

  }

  double multiplica() {
    return 0.0;

  }

  /**
   * Devuelve el resultado de
   * 
   */
  double divide() {
    return 0.0;

  }

  /**
   * Imprime la fracción con numerador y denominador al revés.
   */
  void invierte() {
    int aux;
    aux = numerador;
    this.numerador = this.denominador;
    this.denominador = aux;
    System.out.println(this.numerador + "/" + this.denominador);

  }

}
