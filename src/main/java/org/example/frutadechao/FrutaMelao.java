package org.example.frutadechao;

public class FrutaMelao extends FrutaDeChao {
    public FrutaMelao(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Melão colhido";
    }
}
