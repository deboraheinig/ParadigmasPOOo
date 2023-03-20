// Herança da classe Animal
public class Gato extends Animal {
    private boolean pelagemLonga;

    // Construtor
    public Gato(String nome, int idade, boolean pelagemLonga) {
        super(nome, idade);
        this.pelagemLonga = pelagemLonga;
    }

    // Método getter sobrescrito
    @Override
    public int getIdade() {
        return super.getIdade() * 7; // Idade do gato em "anos de gato"
    }

    // Método setter sobrescrito
    @Override
    public void setNome(String nome) {
        if (nome != null && nome.length() > 0) {
            super.setNome(nome);
        }
    }

    // Método específico da classe Gato
    public void miar() {
        System.out.println("Miau!");
    }
}

