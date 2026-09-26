package org.example.sementes;

public class SementeMelao extends Semente {
    public SementeMelao(float precoBase) {
        super(precoBase);
    }

    public float calcularPreco() {
        return this.precoBase + this.qualidade.aumentoPreco();
    }

    public String colher() {
        return "Melão colhido";
    }
}
