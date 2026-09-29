package org.example.frutadearvore;

public class FrutaCereja extends FrutaDeArvore {
    public FrutaCereja(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Cereja colhida";
    }
}
