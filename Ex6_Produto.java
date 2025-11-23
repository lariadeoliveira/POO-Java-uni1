import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }
}

public class Ex6_Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = sc.nextDouble();

        Produto p = new Produto(nome, preco);

        System.out.println("\nPreço com desconto: R$ " + p.calcularDesconto(desconto));

        sc.close();
    }
}
