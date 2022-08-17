public class TerraMediaPersonagemFactory extends PersonagemFactory{
    @Override
    Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagemCriado = null;
        switch (tipoPersonagem){
            case MAGO:
                personagemCriado = new Mago(nome, 10, 2, 5, 3, 4);
                break;
            case GUERREIRO:
                personagemCriado = new Guerreiro(nome, 1, 8, 5, 10, 6);
                break;
            case LADRAO:
                personagemCriado = new Ladrao(nome, 2, 6, 8, 5, 10);
        }
        
        return personagemCriado;
    }
}
