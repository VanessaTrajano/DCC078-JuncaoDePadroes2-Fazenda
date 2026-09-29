import org.example.fabricas.FabricaAbstrataFrutas;
import org.example.fabricas.FabricaFrutasFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaSementesFactoryTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrataFrutas fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Outono");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }
}
