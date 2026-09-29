package org.example.frutadechao;

public class FrutaMorango extends FrutaDeChao {
    public FrutaMorango(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Morango colhido";
    }
}
