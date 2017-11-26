package Execicios_Revisao;
public class Proprietario {
 
   private String nome;
   private String telefone;

    public Proprietario() {
    }

    public Proprietario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
   public String imprimir(){
   
       return "Nome: "+nome+" - Telefone: "+telefone;
   }
}
