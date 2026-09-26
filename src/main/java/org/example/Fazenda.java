package org.example;

import org.example.fabricas.FabricaAbstrataSementes;
import org.example.frutas.Fruta;
import org.example.sementes.Semente;

public class Fazenda {
    private Fruta fruta;
    private Semente semente;

    public Semente getSemente() {
        return semente;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public Fazenda (FabricaAbstrataSementes fabrica) {
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
