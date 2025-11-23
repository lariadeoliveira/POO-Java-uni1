import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String detalhes() {
        return "Livro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas;
    }
}

public class Ex3_Livro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor: ");
        String autor = sc.nextLine();

        System.out.print("Digite o número de páginas: ");
        int paginas = sc.nextInt();

        Livro l = new Livro(titulo, autor, paginas);

        System.out.println("\n" + l.detalhes());

        sc.close();
    }
}
