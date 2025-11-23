import java.util.Scanner;

class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

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

    public double getSaldo() {
        return saldo;
    }
}

public class Ex8_ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String num = sc.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaBancaria cb = new ContaBancaria(num, saldo);

        System.out.print("\nValor para depósito: ");
        double dep = sc.nextDouble();
        cb.depositar(dep);

        System.out.print("Valor para saque: ");
        double sac = sc.nextDouble();
        cb.sacar(sac);

        System.out.println("\nSaldo final: R$ " + cb.getSaldo());

        sc.close();
    }
}
