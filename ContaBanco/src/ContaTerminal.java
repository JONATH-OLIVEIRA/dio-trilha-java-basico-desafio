import java.io.Console;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;  
        String nomeCliente;  
        double saldo;  

        Console console = System.console();

        if (console == null) {
            System.err.println("Console não disponível.");
            System.exit(1);
        }

        System.out.println("Digite a sua Agencia: ");
        agencia = console.readLine();

        System.out.println("Digite a sua conta: ");
        numero = Integer.parseInt(console.readLine());       

        System.out.println("Digite seu nome: ");
        nomeCliente = console.readLine();

        System.out.println("Digite o valor do deposito: ");
        saldo = Double.parseDouble(console.readLine());

        System.out.println("Olá" + " " + nomeCliente + " " + "Obrigado por criar uma conta em nosso banco, sua agência é : " + agencia + " " + "conta : " + numero + " " + "seu saldo e : " + saldo + " " + " Ja esta disponivel para saque !!");
      
    }
}