package org.example.fabricas;

import org.example.frutadearvore.FrutaDeArvore;
import org.example.frutadearvore.FrutaLaranja;
import org.example.frutadechao.FrutaDeChao;
import org.example.frutadechao.FrutaMelao;

public class FabricaFrutasVerao implements FabricaAbstrataFrutas {
    @Override
    public FrutaDeArvore createFruta() {
        return new FrutaLaranja(100);
    }

    @Override
    public FrutaDeChao createSemente() {
        return new FrutaMelao(250);
    }
}
