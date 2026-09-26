package org.example.fabricas;

import org.example.frutas.Fruta;
import org.example.sementes.Semente;

public interface FabricaAbstrataSementes {
    Fruta createFruta();
    Semente createSemente();
}
