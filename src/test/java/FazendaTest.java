import org.example.*;
import org.example.fabricas.FabricaAbstrataSementes;
import org.example.fabricas.FabricaSementesFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FazendaTest {
    @Test
    void deveEmitirFrutaVerao() {
        FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Verao");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Laranja colhida", fazenda.colherFruta());
    }

    @Test
    void deveEmitirFrutaPrimavera() {
        FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Primavera");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Cereja colhida", fazenda.colherFruta());
    }

    @Test
    void deveEmitirSementeVerao() {
        FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Verao");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Melão colhido", fazenda.colherSemente());
    }

    @Test
    void deveEmitirSementePrimavera() {
        FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Primavera");
        Fazenda fazenda = new Fazenda(fabrica);
        assertEquals("Morango colhido", fazenda.colherSemente());
    }
}
