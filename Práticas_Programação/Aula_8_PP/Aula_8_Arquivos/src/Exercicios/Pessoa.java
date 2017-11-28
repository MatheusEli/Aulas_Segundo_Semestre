package Exercicios;
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String rg;

    public Pessoa(String nome, String endereco, String rg) {
        this.nome = nome;
        this.endereco = endereco;
        this.rg = rg;
    }

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        
        return "Nome: "+nome+" Endereco:"+endereco+" RG: "+rg;
    }
}
