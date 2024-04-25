public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo, int ano, String placa, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    // Método para acelerar o carro
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Carro acelerando. Nova velocidade: " + velocidadeAtual + " km/h");
    }

    // Método para frear o carro
    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            System.out.println("Carro freando. Nova velocidade: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    // Método principal para demonstração
    public static void main(String[] args) {
        // Criando um carro e realizando operações
        Carro carro1 = new Carro("Ford", "Mustang", 1967, "ABC1234", 0);
        carro1.acelerar();
        carro1.frear();
        carro1.frear();
        carro1.exibirInfo();
    }
}
