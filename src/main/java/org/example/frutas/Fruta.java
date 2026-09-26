package org.example.frutas;

import org.example.qualidades.Qualidade;

public abstract class Fruta {
    protected Qualidade qualidade;

    protected float precoBase;

    public Fruta(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setQualidade(Qualidade qualidade) {
        this.qualidade = qualidade;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();

    public abstract String colher();
}
