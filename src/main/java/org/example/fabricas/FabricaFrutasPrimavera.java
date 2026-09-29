package org.example.fabricas;

import org.example.frutadearvore.FrutaDeArvore;
import org.example.frutadearvore.FrutaCereja;
import org.example.frutadechao.FrutaDeChao;
import org.example.frutadechao.FrutaMorango;

public class FabricaFrutasPrimavera implements FabricaAbstrataSementes{
    @Override
    public FrutaDeArvore createFruta() {
        return new FrutaCereja(80);
    }

    @Override
    public FrutaDeChao createSemente() {
        return new FrutaMorango(120);
    }

}
