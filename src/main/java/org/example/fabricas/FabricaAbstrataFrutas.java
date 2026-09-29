package org.example.fabricas;

import org.example.frutadearvore.FrutaDeArvore;
import org.example.frutadechao.FrutaDeChao;

public interface FabricaAbstrataFrutas {
    FrutaDeArvore createFruta();
    FrutaDeChao createSemente();
}
