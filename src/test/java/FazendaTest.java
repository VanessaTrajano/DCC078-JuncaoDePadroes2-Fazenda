import org.example.*;
import org.example.fabricas.FabricaAbstrataFrutas;
import org.example.fabricas.FabricaFrutasFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FazendaTest {
    @Test
    void deveEmitirFrutaVerao() {
        FabricaAbstrataFrutas fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Verao");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Laranja colhida", fazenda.colherFruta());
    }

    @Test
    void deveEmitirFrutaPrimavera() {
        FabricaAbstrataFrutas fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Primavera");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Cereja colhida", fazenda.colherFruta());
    }

    @Test
    void deveEmitirSementeVerao() {
        FabricaAbstrataFrutas fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Verao");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Melão colhido", fazenda.colherSemente());
    }

    @Test
    void deveEmitirSementePrimavera() {
        FabricaAbstrataFrutas fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Primavera");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Morango colhido", fazenda.colherSemente());
    }
}
