public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor para inicializar os atributos
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        }
    }

    // Método para consultar o saldo da conta
    public double consultarSaldo() {
        return saldo;
    }

    // Método principal para demonstração
    public static void main(String[] args) {
        // Criando uma conta bancária e realizando operações
        ContaBancaria conta1 = new ContaBancaria(123456, "João", 1000.0);
        
        System.out.println("Saldo atual da conta: R$" + conta1.consultarSaldo());
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.sacar(1500.0); // Tentativa de saque com saldo insuficiente
    }
}
