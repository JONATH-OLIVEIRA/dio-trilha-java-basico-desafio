import classes.*;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        
        // Criando uma instância do dispositivo
        Dispositivo dispositivo = new Dispositivo();

        // Ligando o dispositivo
        dispositivo.ligar();

        // Abrindo o aplicativo de reprodutor musical
        dispositivo.abrirAplicativo("Reprodutor Musical");

        // Criando instâncias das funcionalidades específicas
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Telefone telefone = new Telefone();
        NavegadorInternet navegador = new NavegadorInternet();

        // Exemplo de uso das funcionalidades
        reprodutor.reproduzirMusica();
        telefone.fazerChamada("123456789");
        navegador.exibirPagina("https://www.example.com");
    }
}