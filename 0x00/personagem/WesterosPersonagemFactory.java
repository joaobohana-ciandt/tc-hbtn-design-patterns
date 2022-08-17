public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem tipoPersonagem, String nome) {
        Personagem personagemCriado = null;
        switch (tipoPersonagem){
            case MAGO:
                personagemCriado = new Mago(nome, 8, 3, 3, 3, 4);
                break;
            case GUERREIRO:
                personagemCriado = new Guerreiro(nome, 0, 9, 7, 10, 7);
                break;
            case LADRAO:
                personagemCriado = new Ladrao(nome, 1, 8, 7, 7, 10);
        }

        return personagemCriado;
    }
}
