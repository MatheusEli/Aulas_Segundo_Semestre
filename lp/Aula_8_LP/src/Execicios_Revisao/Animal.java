package Execicios_Revisao;
public class Animal {
    
    private String nome;
    private String raca;
    private String cor;
    private int anonascimento;
    private Proprietario proprietario;

    public Animal() {
    
        this.proprietario = new Proprietario();
    }

    public Animal(String nome, String raca, String cor, int anonascimento, Proprietario proprietario) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anonascimento = anonascimento;
        this.proprietario = proprietario;
    }

    public int getAnonascimento() {
        return anonascimento;
    }

    public void setAnonascimento(int anonascimento) {
        this.anonascimento = anonascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public String imprimir(){
    
        return "*DADOS ANIMAL*\nNome: "+nome+" - Raça: "+raca+" - Cor: "+cor+" - Ano de Nascimento: "+anonascimento+"\n"
                + "*DADOS PROPRIETÁRIO*\n"+proprietario.imprimir()+"\n--------------------------------------";
    }    
}
