import java.util.Scanner;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado = false;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado!");
    }

    public void acelerar() {
        if (ligado)
            System.out.println("Acelerando...");
        else
            System.out.println("Ligue o carro primeiro!");
    }
}

public class Ex9_Carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        Carro c = new Carro(marca, modelo, ano);

        c.ligar();
        c.acelerar();
        c.desligar();

        sc.close();
    }
}
