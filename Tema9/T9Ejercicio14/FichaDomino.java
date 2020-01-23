package T9Ejercicio14;

public class FichaDomino {
    private int ladoizq;
    private int ladoder;

    public FichaDomino(int ladoizq, int ladoder) {
        this.ladoizq = ladoizq;
        this.ladoder = ladoder;
    }

    public FichaDomino voltea() {
        FichaDomino aux = new FichaDomino(this.ladoizq, this.ladoder);
        int auxiliar = aux.ladoizq;
        aux.ladoizq = aux.ladoder;
        aux.ladoder = auxiliar;
        return aux;
    }

    public boolean encaja(FichaDomino ficha) {
        if (this.ladoder == ficha.ladoder) {
            return true;
        } else if (this.ladoder == ficha.ladoizq) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[ " + ladoizq + " | " + ladoder + " ] ";
    }
}
