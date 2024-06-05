package bancoJava;

public class Transacao {
    public void deposito(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado na conta número " + conta.getNumero());
    }

    public void saque(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado na conta número " + conta.getNumero());
        } else {
            System.out.println("Saldo insuficiente para saque na conta número " + conta.getNumero());
        }
    }

    public boolean transferencia(Conta origem, Conta destino, double valor) {
        if (origem.getSaldo() >= valor) {
            origem.setSaldo(origem.getSaldo() - valor);
            destino.setSaldo(destino.getSaldo() + valor);
            System.out.println("Transferência de R$" + valor + " realizada da conta número " + origem.getNumero() + " para a conta número " + destino.getNumero());
            return true; // Transferência bem-sucedida
        } else {
            System.out.println("Saldo insuficiente para transferência na conta número " + origem.getNumero());
            return false; // Transferência falhou
        }
    }
}
           
