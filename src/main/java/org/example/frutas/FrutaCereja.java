package org.example.frutas;

public class FrutaCereja extends Fruta {
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
