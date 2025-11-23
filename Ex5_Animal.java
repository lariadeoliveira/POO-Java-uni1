import java.util.Scanner;

class Animal {
    private String nome;
    private String alimentacao;

    public Animal(String nome, String alimentacao) {
        this.nome = nome;
        this.alimentacao = alimentacao;
    }

    public String emitirSom() {
        return "O animal " + nome + " está emitindo seu som!";
    }
}

public class Ex5_Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nome = sc.nextLine();

        System.out.print("Digite o tipo de alimentação: ");
        String alimentacao = sc.nextLine();

        Animal a = new Animal(nome, alimentacao);

        System.out.println("\n" + a.emitirSom());

        sc.close();
    }
}
