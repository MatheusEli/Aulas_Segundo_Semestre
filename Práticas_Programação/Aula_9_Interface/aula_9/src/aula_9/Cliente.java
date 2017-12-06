package aula_9;
public class Cliente {
    
    private String nome;
    private int idade;
    private String email;
    private char sexo;
    private String numero;
    private Endereco endereco;

    public Cliente(String nome, int idade, String email, char sexo, String numero) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.sexo = sexo;
        this.numero = numero;
    }

    public Cliente() {
        
        this.endereco = new Endereco();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "*Cliente \nNome: " + nome + " idade: " + idade + " Email: " + email + " Sexo: " + sexo + " Número: " + numero+"\n"
                + "*Endereço: "+endereco.toString()+"\n------------------------------------------";
    }
    
    
}