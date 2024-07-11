package factorymethods;

import factorymethods.FabricaMusculos;

public class FactoryMethod {
    public static void main(String[] args) {
        FabricaMusculos fabrica = new FabricaMusculos();
        
        Academico AM = fabrica. criarSuper("Musculoso");
        AM.atacar();
        
        Academico AR = fabrica. criarSuper("rapido");
        AR.atacar();
        
        
    }  
}
