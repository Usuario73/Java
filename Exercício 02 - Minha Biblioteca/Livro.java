public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor para inicializar os atributos
    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Método para exibir informações do livro
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
    }

    // Método principal para demonstração
    public static void main(String[] args) {
        // Criando instâncias de livros e exibindo informações
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        System.out.println("Informações do Livro 1:");
        livro1.exibirInfo();
        
        System.out.println(); // Adicionando uma linha em branco
        
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        System.out.println("Informações do Livro 2:");
        livro2.exibirInfo();
    }
}
