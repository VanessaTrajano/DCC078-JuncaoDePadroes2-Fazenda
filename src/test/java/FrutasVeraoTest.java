import org.example.Fazenda;
import org.example.fabricas.*;
import org.example.qualidades.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FrutasVeraoTest {
    static Fazenda verao;

    @BeforeAll
    static void inicia(){
        FabricaAbstrataSementes fabrica = FabricaFrutasFactory.getInstance().obterFabrica("Verao");
        verao = new Fazenda(fabrica);
    }

    @Test
    void deveRetornarPrecoFrutaVeraoNormal() {
        Qualidade qualidade = new Normal();
        verao.getFruta().setQualidade(qualidade);
        assertEquals(100, verao.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaVeraoCobre() {
        Qualidade qualidade = new Cobre();
        verao.getFruta().setQualidade(qualidade);
        assertEquals(105, verao.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaVeraoPrata() {
        Qualidade qualidade = new Prata();
        verao.getFruta().setQualidade(qualidade);
        assertEquals(110, verao.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoFrutaVeraoOuro() {
        Qualidade qualidade = new Ouro();
        verao.getFruta().setQualidade(qualidade);
        assertEquals(120, verao.getFruta().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementeVeraoNormal() {
        Qualidade qualidade = new Normal();
        verao.getSemente().setQualidade(qualidade);
        assertEquals(250, verao.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementeVeraoCobre() {
        Qualidade qualidade = new Cobre();
        verao.getSemente().setQualidade(qualidade);
        assertEquals(255, verao.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementeVeraoPrata() {
        Qualidade qualidade = new Prata();
        verao.getSemente().setQualidade(qualidade);
        assertEquals(260, verao.getSemente().calcularPreco());
    }

    @Test
    void deveRetornarPrecoSementeVeraoOuro() {
        Qualidade qualidade = new Ouro();
        verao.getSemente().setQualidade(qualidade);
        assertEquals(270, verao.getSemente().calcularPreco());
    }
}
