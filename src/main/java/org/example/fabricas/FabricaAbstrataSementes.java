package org.example.fabricas;

import org.example.frutadearvore.FrutaDeArvore;
import org.example.frutadechao.FrutaDeChao;

public interface FabricaAbstrataSementes {
    FrutaDeArvore createFruta();
    FrutaDeChao createSemente();
}
