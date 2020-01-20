package T9Ejercicio10;

public class Ameba {
    private int peso;

    //Constructor
    public Ameba() {
        this.peso = 3;
    }

    public void come(int microgramos) {
        this.peso = (this.peso - 1) + microgramos;
    }

    public void come(Ameba ameba) {
        this.peso = (this.peso - 1) + ameba.peso;
        ameba.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una Ameba y peso " + peso + " microgramos";
    }
}
