package bancoJava;

public class Banco {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        // Criando contas
        ContaCorrente contaCorrenteJoao = new ContaCorrente(1, 1000.0, cliente1, 500.0);
        ContaPoupanca contaPoupancaMaria = new ContaPoupanca(2, 500.0, cliente2, 0.05);

        // Realizando operações
        Transacao transacao = new Transacao();

        transacao.deposito(contaCorrenteJoao, 200.0);
        transacao.saque(contaCorrenteJoao, 100.0);

        transacao.deposito(contaPoupancaMaria, 300.0);
        transacao.saque(contaPoupancaMaria, 400.0); // Tentativa de saque com saldo insuficiente

        transacao.transferencia(contaCorrenteJoao, contaPoupancaMaria, 300.0);

        // Exibindo saldos finais
        System.out.println("Saldo final da conta corrente de João: R$" + contaCorrenteJoao.getSaldo());
        System.out.println("Saldo final da conta poupança de Maria: R$" + contaPoupancaMaria.getSaldo());
    }
}
