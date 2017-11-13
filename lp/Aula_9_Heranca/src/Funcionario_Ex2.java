public class Funcionario_Ex2 {
    
    private String nome;
    private int horastrab;
    private double valorhora;

    public Funcionario_Ex2() {
    }

    public Funcionario_Ex2(String nome, int horastrab, double valorhora) {
        this.nome = nome;
        this.horastrab = horastrab;
        this.valorhora = valorhora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorastrab() {
        return horastrab;
    }

    public void setHorastrab(int horastrab) {
        this.horastrab = horastrab;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    
    public double calcularSalario(){
    
        double salariofinal = (horastrab * valorhora);
        return salariofinal;
    }
    
    public String imprimir(){
    
        return "---DADOS FUNCIONARIO---\nNome: "+nome+"\nHoras Trabalhadas: "+horastrab+"\n"
                + "Valor/Hora: "+valorhora+"\nSALARIO FINAL: "+calcularSalario()+"\n";
    }
}
