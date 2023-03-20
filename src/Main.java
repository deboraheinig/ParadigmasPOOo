public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Totó", 5, "Vira-lata");
        Gato gato = new Gato("Frajola", 3, true);
        Veterinario veterinario = new Veterinario("Dr. Silva", "Clínica geral");

        System.out.println(cachorro.getNome()); // Saída: "Cachorro: Totó"
        cachorro.latir();

        gato.setIdade(4);
        gato.miar();
        System.out.println(gato.getIdade()); // Saída: 28 (idade em "anos de gato")

        veterinario.examinarAnimal(cachorro); // Saída: "Examinando Totó"
    }
}