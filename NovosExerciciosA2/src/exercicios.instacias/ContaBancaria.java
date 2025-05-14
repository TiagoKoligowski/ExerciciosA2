public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "João";

        conta.depositar(500);
        conta.mostrarSaldo();

        conta.sacar(200);
        conta.mostrarSaldo();

        conta.sacar(400);
        conta.mostrarSaldo();
    }
}
