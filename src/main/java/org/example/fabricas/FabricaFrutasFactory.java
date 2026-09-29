package org.example.fabricas;

public class FabricaFrutasFactory {
    private FabricaFrutasFactory() {};
    private static FabricaFrutasFactory instance = new FabricaFrutasFactory();
    public static FabricaFrutasFactory getInstance() {
        return instance;
    }
    public FabricaAbstrataSementes obterFabrica(String estacao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.fabricas.FabricaSementes" + estacao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrataSementes)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrataSementes) objeto;
    }
}
