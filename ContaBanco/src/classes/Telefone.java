package classes;

import interfaces.ITelefone;

public class Telefone implements ITelefone {

    public void atenderChamada() {
        // Implementação para atender uma chamada telefônica
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para o número: " + numero);
    }
    

    public void iniciarCorreioDeVoz() {
        // Implementação para iniciar o correio de voz
    }
}