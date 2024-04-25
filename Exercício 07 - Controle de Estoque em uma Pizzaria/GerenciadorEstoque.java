import java.util.ArrayList;
import java.util.Scanner;

// Classe Produto
class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    // Construtor para inicializar os atributos
    public Produto(String nome, int codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos para obter informações do produto
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método para atualizar a quantidade em estoque
    public void atualizarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para calcular o valor total em estoque
    public double calcularValorTotal() {
        return preco * quantidade;
    }

    // Método para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Estoque");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do Produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Preço do Produto: R$");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = scanner.nextInt();

                    Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
                    estoque.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("\nDigite o código do produto a ser atualizado: ");
                    int codigoProduto = scanner.nextInt();
                    System.out.print("Digite a quantidade a ser adicionada (valor positivo) ou removida (valor negativo): ");
                    int quantidadeAtualizacao = scanner.nextInt();

                    for (Produto produto : estoque) {
                        if (produto.getCodigo() == codigoProduto) {
                            produto.atualizarQuantidade(quantidadeAtualizacao);
                            System.out.println("Estoque do produto atualizado com sucesso!");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o código do produto a ser removido: ");
                    int codigoRemocao = scanner.nextInt();

                    for (int i = 0; i < estoque.size(); i++) {
                        if (estoque.get(i).getCodigo() == codigoRemocao) {
                            estoque.remove(i);
                            System.out.println("Produto removido com sucesso!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n===== RELATÓRIO DE ESTOQUE =====");
                    for (Produto produto : estoque) {
                        produto.exibirInfo();
                        System.out.println("--------------------");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
