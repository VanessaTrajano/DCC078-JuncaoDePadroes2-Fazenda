import org.example.fabricas.FabricaAbstrataSementes;
import org.example.fabricas.FabricaSementesFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaSementesFactoryTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Outono");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }
}
