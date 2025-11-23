import java.util.Scanner;

class Retangulo {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularArea() {
        return largura * comprimento;
    }

    public double calcularPerimetro() {
        return 2 * (largura + comprimento);
    }
}

public class Ex4_Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = sc.nextDouble();

        Retangulo r = new Retangulo(largura, comprimento);

        System.out.println("\nÁrea: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        sc.close();
    }
}
