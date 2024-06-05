package bancoJava;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(numero, saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void atualizarSaldo() {
        // Na conta corrente, não há atualização de saldo específica, pois o saldo não sofre alterações automáticas
    }

    // outros métodos específicos de ContaCorrente
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
