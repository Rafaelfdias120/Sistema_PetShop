package Sistema_PetShop;

public class animal {
    private String nome;
    private String raca;
    private int idade;

    public animal(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Getters
    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setRaca(String raca) { this.raca = raca; }
    public void setIdade(int idade) { this.idade = idade; }

}