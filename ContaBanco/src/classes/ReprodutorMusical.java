package classes;

import interfaces.IReprodutorMusical;

// Classe concreta para o Reprodutor Musical
public class ReprodutorMusical implements IReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Musica Tocando : ");
    }
    @Override
    public void tocarPausar() {
        System.out.println("Musica Pausada : ");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação para selecionar uma música específica
    }
}