import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String cumprimentar() {
        return "Olá! Meu nome é " + nome + " e tenho " + idade + " anos.";
    }
}

public class Ex2_Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.println("\n" + p.cumprimentar());

        sc.close();
    }
}
