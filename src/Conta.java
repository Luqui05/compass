public class Conta {
    private int numeroConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    private String nomeTitular;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public void deposito(double quantidade) {
        this.saldo += quantidade;
    }

    public void saque(double quantidade) {
        this.saldo -= quantidade + 5;
    }

    public String toString() {
        return "Número da conta: " + numeroConta + " Nome do titular da conta: " + nomeTitular + " Saldo: R$ " + saldo;
    }
}
