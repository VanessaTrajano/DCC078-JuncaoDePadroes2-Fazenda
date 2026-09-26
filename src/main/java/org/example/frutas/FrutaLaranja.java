package org.example.frutas;

public class FrutaLaranja extends Fruta {
    public FrutaLaranja(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Laranja colhida";
    }
}
