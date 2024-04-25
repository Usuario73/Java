import java.util.ArrayList;

// Classe Contato
class Contato {
    private String nome;
    private String telefone;

    // Construtor para inicializar os atributos
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método para obter o nome do contato
    public String getNome() {
        return nome;
    }

    // Método para obter o telefone do contato
    public String getTelefone() {
        return telefone;
    }
}

// Classe Agenda
class Agenda {
    private ArrayList<Contato> contatos;

    // Construtor para inicializar a lista de contatos
    public Agenda() {
        contatos = new ArrayList<>();
    }

    // Método para adicionar um novo contato à agenda
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    // Método para buscar um contato pelo nome
    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }
}

// Classe principal para demonstração
public class Main {
    public static void main(String[] args) {
        // Criando uma agenda e adicionando alguns contatos
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("João", "123456789"));
        agenda.adicionarContato(new Contato("Maria", "987654321"));
        agenda.adicionarContato(new Contato("Pedro", "999999999"));

        // Buscando um contato pelo nome
        Contato contatoEncontrado = agenda.buscarContatoPorNome("Maria");
        if (contatoEncontrado != null) {
            System.out.println("Telefone de Maria: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
