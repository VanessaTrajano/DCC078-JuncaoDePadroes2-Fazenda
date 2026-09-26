package org.example.sementes;

import org.example.qualidades.Qualidade;

public abstract class Semente {
    protected Qualidade qualidade;

    protected float precoBase;

    public Semente(float precoBase) {
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
