package org.example.frutadearvore;

public class FrutaLaranja extends FrutaDeArvore {
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
