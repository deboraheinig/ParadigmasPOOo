// Herança da classe Animal
public class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    // Método getter sobrescrito
    @Override
    public String getNome() {
        return "Cachorro: " + super.getNome();
    }

    // Método setter sobrescrito
    @Override
    public void setIdade(int idade) {
        if (idade > 0 && idade <= 20) {
            super.setIdade(idade);
        }
    }
    // Método específico da classe Cachorro
    public void latir() {
        System.out.println("Au au!");
    }
}
