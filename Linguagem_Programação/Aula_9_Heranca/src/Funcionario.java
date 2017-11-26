public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentual){
    
        this.salario += this.salario*percentual/100;
    }
    
    public String imprimir(){
    
        return "Funcionario : "+nome+"\nSalario: R$"+salario;
    }
}
