
package Exercicios_GUI;
public class Pessoa {
    
    private String nome;
    private int idade;
    private char sexo;
    private String profissao;
    private boolean email;
    private String nacionalidade;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    public String retornarNome(){
    
        return nome;
    }
    
    @Override
    public String toString() {
        return nome+" - "+idade+" - "+profissao+" - '"+sexo+"' - "+nacionalidade;
    }

    
}
