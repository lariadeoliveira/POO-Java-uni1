import java.util.Scanner;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        return salario;
    }
}

public class Ex10_Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário atual: ");
        double salario = sc.nextDouble();

        Funcionario f = new Funcionario(nome, cargo, salario);

        System.out.print("\nPercentual de aumento: ");
        double perc = sc.nextDouble();

        System.out.println("\nNovo salário: R$ " + f.reajustarSalario(perc));

        sc.close();
    }
}
