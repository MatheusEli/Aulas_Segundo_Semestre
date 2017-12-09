package Aula_8_AssociacaoDeClasses;

public class Item {
    
    private int codigo;
    private int quantidade;
    private double precoUnitario;

    public Item() {
    }

    public Item(int codigo, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nQuantidade: " + quantidade + "\nPreço Unitário: " + precoUnitario;
    }
    
    
    
}
