package org.example.fabricas;

import org.example.frutas.Fruta;
import org.example.frutas.FrutaCereja;
import org.example.sementes.Semente;
import org.example.sementes.SementeMorango;

public class FabricaSementesPrimavera implements FabricaAbstrataSementes{
    @Override
    public Fruta createFruta() {
        return new FrutaCereja(80);
    }

    @Override
    public Semente createSemente() {
        return new SementeMorango(120);
    }

}
