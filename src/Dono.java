// Classe que armazena informações sobre o dono do animal
public class Dono {
    private String nome;
    private String endereco;

    // Construtor
    public Dono(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
