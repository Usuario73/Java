public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    // Construtor para inicializar os atributos
    public Jogador(String nome, int pontuacaoInicial, int nivelInicial) {
        this.nome = nome;
        this.pontuacao = pontuacaoInicial;
        this.nivel = nivelInicial;
    }

    // Método para aumentar a pontuação do jogador
    public void aumentarPontuacao(int pontos) {
        pontuacao += pontos;
    }

    // Método para subir de nível do jogador
    public void subirNivel() {
        nivel++;
    }

    // Método para exibir informações do jogador
    public void exibirInfo() {
        System.out.println("Nome do Jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    // Método principal para demonstração
    public static void main(String[] args) {
        // Criando um jogador e realizando operações
        Jogador jogador1 = new Jogador("Player1", 0, 1);
        jogador1.aumentarPontuacao(100);
        jogador1.subirNivel();
        jogador1.exibirInfo();
    }
}
