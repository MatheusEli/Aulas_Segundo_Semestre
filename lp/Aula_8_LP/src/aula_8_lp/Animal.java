
package aula_8_lp;

public class Animal {
    
    private String nome;
    private String raça;
    private String cor;
    private int idade;
    private Proprietario proprietario;

    public Animal() {
        
        this.proprietario = new Proprietario();
    }
    
    public Animal(String nome, String raça, String cor, int idade) {
        this.nome = nome;
        this.raça = raça;
        this.cor = cor;
        this.idade = idade;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
    
        return "Nome animal: "+nome+" - Raça: "+raça+" - Cor: "+cor+" - Idade: "+idade+" | "+proprietario.toString();
    }
    
    
}
