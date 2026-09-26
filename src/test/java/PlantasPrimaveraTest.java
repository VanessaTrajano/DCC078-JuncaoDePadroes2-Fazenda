import org.example.Fazenda;
import org.example.fabricas.*;
import org.example.qualidades.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlantasPrimaveraTest {
    static Fazenda primavera;

    @BeforeAll
    static void inicia(){
        FabricaAbstrataSementes fabrica = FabricaSementesFactory.getInstance().obterFabrica("Primavera");
        primavera = new Fazenda(fabrica);
    }

    @Test
    void deveRetornarPrecoFrutaPrimaveraNormal() {
        Qualidade qualidade = new Normal();
        primavera.getFruta().setQualidade(qualidade);
        assertEquals(80, primavera.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaPrimaveraCobre() {
        Qualidade qualidade = new Cobre();
        primavera.getFruta().setQualidade(qualidade);
        assertEquals(85, primavera.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaPrimaveraPrata() {
        Qualidade qualidade = new Prata();
        primavera.getFruta().setQualidade(qualidade);
        assertEquals(90, primavera.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaPrimaveraOuro() {
        Qualidade qualidade = new Ouro();
        primavera.getFruta().setQualidade(qualidade);
        assertEquals(100, primavera.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementePrimaveraNormal() {
        Qualidade qualidade = new Normal();
        primavera.getSemente().setQualidade(qualidade);
        assertEquals(120, primavera.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementePrimaveraCobre() {
        Qualidade qualidade = new Cobre();
        primavera.getSemente().setQualidade(qualidade);
        assertEquals(125, primavera.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementePrimaveraPrata() {
        Qualidade qualidade = new Prata();
        primavera.getSemente().setQualidade(qualidade);
        assertEquals(130, primavera.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementePrimaveraOuro() {
        Qualidade qualidade = new Ouro();
        primavera.getSemente().setQualidade(qualidade);
        assertEquals(140, primavera.getSemente().calcularPreco());
    }
}
