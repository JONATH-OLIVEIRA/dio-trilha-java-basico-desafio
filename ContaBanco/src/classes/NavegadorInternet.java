package classes;

import interfaces.INavegadorInternet;

// Classe concreta para o Navegador de Internet
public class NavegadorInternet implements INavegadorInternet {
    public void exibirPagina(String url) {
        // Implementação para exibir uma página web com a URL especificada
    }

    public void adicionarNovaAba() {
        // Implementação para adicionar uma nova aba ao navegador
    }

    public void atualizarPagina() {
        System.out.println("Pagina Atualizada : ");
    }
}