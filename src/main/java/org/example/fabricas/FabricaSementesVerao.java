package org.example.fabricas;

import org.example.frutas.Fruta;
import org.example.frutas.FrutaLaranja;
import org.example.sementes.Semente;
import org.example.sementes.SementeMelao;

public class FabricaSementesVerao implements FabricaAbstrataSementes{
    @Override
    public Fruta createFruta() {
        return new FrutaLaranja(100);
    }

    @Override
    public Semente createSemente() {
        return new SementeMelao(250);
    }
}
