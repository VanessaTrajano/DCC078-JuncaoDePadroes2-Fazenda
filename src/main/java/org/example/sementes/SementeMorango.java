package org.example.sementes;

public class SementeMorango extends Semente {
    public SementeMorango(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Morango colhido";
    }
}
