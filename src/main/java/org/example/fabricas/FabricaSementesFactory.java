package org.example.fabricas;

public class FabricaSementesFactory {
    private FabricaSementesFactory() {};
    private static FabricaSementesFactory instance = new FabricaSementesFactory();
    public static FabricaSementesFactory getInstance() {
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
