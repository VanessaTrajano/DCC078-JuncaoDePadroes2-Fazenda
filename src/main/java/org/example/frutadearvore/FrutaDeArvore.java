package org.example.frutadearvore;

import org.example.qualidades.Qualidade;

public abstract class FrutaDeArvore {
    protected Qualidade qualidade;

    protected float precoBase;

    public FrutaDeArvore(float precoBase) {
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
