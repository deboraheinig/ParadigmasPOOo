// Classe que não herda de Animal
public class Veterinario {
    private String nome;
    private String especialidade;

    // Construtor
    public Veterinario(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método que usa um objeto da classe Animal
    public void examinarAnimal(Animal animal) {
        System.out.println("Examinando " + animal.getNome());
        // código para examinar o animal...
    }
}
