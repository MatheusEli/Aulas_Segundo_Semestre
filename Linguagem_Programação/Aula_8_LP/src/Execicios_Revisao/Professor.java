package Execicios_Revisao;
public class Professor {
    
    private String nome;
    private String titulacao;

    public Professor() {
    }

    public Professor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    public String imprimir(){
    
        return "Nome Professor: "+nome+" - Titulação: "+titulacao;
    }
}
