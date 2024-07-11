package factorymethods;
public class FabricaMusculos {
    public Academico criarSuper(String tipo) {
        if(tipo.equals("fraco")) {
            return new AcademicoMusculoso();
        } else if (tipo.equals("forte")) {
            return new AcademicoRapido();
        }else {
            throw new IllegalArgumentException("Tipo de inimigo inválido");
        }
    }
}
