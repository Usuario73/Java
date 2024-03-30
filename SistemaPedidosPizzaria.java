import java.util.ArrayList;
import java.util.Scanner;

// Classe Pizza
class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;

    // Construtor para inicializar os atributos
    public Pizza(String nome, double valor, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    // Métodos para obter informações da pizza
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getIngredientes() {
        return ingredientes;
    }
}

// Classe Pedido
class Pedido {
    private ArrayList<Pizza> pizzas;
    private int quantidadeTotal;
    private double valorTotal;

    // Construtor para inicializar a lista de pizzas
    public Pedido() {
        pizzas = new ArrayList<>();
        quantidadeTotal = 0;
        valorTotal = 0.0;
    }

    // Método para adicionar uma pizza ao pedido
    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        quantidadeTotal++;
        valorTotal += pizza.getValor();
    }

    // Método para cancelar um pedido
    public void cancelarPedido() {
        pizzas.clear();
        quantidadeTotal = 0;
        valorTotal = 0.0;
        System.out.println("Pedido cancelado com sucesso.");
    }

    // Método para gerar relatório de pedidos
    public void gerarRelatorio() {
        System.out.println("\n===== RELATÓRIO DE PEDIDOS =====");
        System.out.println("Total de Pedidos: " + quantidadeTotal);
        System.out.println("Valor Total dos Pedidos: R$" + valorTotal);
        System.out.println("Média de Preço dos Pedidos: R$" + (valorTotal / quantidadeTotal));
        System.out.println("===== DETALHES DOS PEDIDOS =====");
        for (Pizza pizza : pizzas) {
            System.out.println("Pizza: " + pizza.getNome() + " - Valor: R$" + pizza.getValor());
        }
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        // Criação de algumas pizzas
        Pizza pizza1 = new Pizza("Calabresa", 30.0, "Calabresa, mussarela, cebola");
        Pizza pizza2 = new Pizza("Margherita", 35.0, "Molho de tomate, mussarela, manjericão");
        Pizza pizza3 = new Pizza("Frango com Catupiry", 32.0, "Frango desfiado, Catupiry, milho");

        // Criando um pedido
        Pedido pedido = new Pedido();

        // Adicionando pizzas ao pedido
        pedido.adicionarPizza(pizza1);
        pedido.adicionarPizza(pizza2);
        pedido.adicionarPizza(pizza3);

        // Gerando relatório de pedidos
        pedido.gerarRelatorio();

        // Cancelando o pedido
        pedido.cancelarPedido();

        // Gerando relatório após cancelamento
        pedido.gerarRelatorio();
    }
}
