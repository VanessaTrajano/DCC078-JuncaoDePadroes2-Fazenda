package org.example;

import org.example.fabricas.FabricaAbstrataFrutas;
import org.example.frutadearvore.FrutaDeArvore;
import org.example.frutadechao.FrutaDeChao;

public class Fazenda {
    private FrutaDeArvore fruta;
    private FrutaDeChao semente;

    public FrutaDeChao getSemente() {
        return semente;
    }

    public FrutaDeArvore getFruta() {
        return fruta;
    }

    public Fazenda (FabricaAbstrataFrutas fabrica) {
        this.fruta = fabrica.createFruta();
        this.semente = fabrica.createSemente();
    }

    public String colherFruta() {
        return this.fruta.colher();
    }

    public String colherSemente() {
        return this.semente.colher();
    }
}
