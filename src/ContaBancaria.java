public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static class Main {
        public static void main(String[] args) {
            ContaBancaria conta1 = new ContaBancaria();
            conta1.numeroConta = "123";
            conta1.titular = "Vinícius";
            conta1.depositar(1000);
            conta1.sacar(300);
            conta1.consultarSaldo();

            ContaBancaria conta2 = new ContaBancaria();
            conta2.numeroConta = "456";
            conta2.titular = "Fernanda";
            conta2.depositar(500);
            conta2.consultarSaldo();
        }
    }
}
