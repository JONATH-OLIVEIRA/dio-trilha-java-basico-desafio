package bancoJava;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, double saldo, Cliente cliente, double taxaRendimento) {
        super(numero, saldo, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void atualizarSaldo() {
        // Na conta poupança, o saldo é atualizado com base na taxa de rendimento
        double saldoAtual = getSaldo();
        double rendimento = saldoAtual * getTaxaRendimento();
        setSaldo(saldoAtual + rendimento);
    }

    // outros métodos específicos de ContaPoupanca
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
