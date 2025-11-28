package Sistema_PetShop;

public class servico {
    private String tipo;
    private double preco;

    public servico(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    // Getters
    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }

    // Setters
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setPreco(double preco) { this.preco = preco; }

}
