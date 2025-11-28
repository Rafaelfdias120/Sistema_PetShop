package Sistema_PetShop;

public class cliente {
    private String nome;
    private String endereco;
    private int telefone;
    private int CPF;

    public cliente(String nome, String endereco, int telefone, int CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CPF = CPF;
    }

    // Getters
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public int getTelefone() { return telefone; }
    public int getCPF() { return CPF; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(int telefone) {this.telefone = telefone; }
    public void setCPF(int CPF) { this.CPF = CPF; }
    
}