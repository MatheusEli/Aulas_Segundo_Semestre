package Aula_9_Revisao;
public class Funcionario {
    
    private String nome;
    private double horasTrab;
    private double valorHoras;

    public Funcionario() {
    }

    public Funcionario(String nome, double horasTrab, double valorHoras) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHoras = valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
    
    public double salarioFinal(){
    
        double salariofinal;
        salariofinal = (valorHoras*horasTrab);
        return salariofinal;
    }
    
    public String imprimir(){
    
        return "------------------------------------------------------\nNome: "+nome+" - Horas Trabalhadas: "+horasTrab+" - Valor/Hora: "+valorHoras+""
                + " - SALARIO FINAL: "+salarioFinal();
    }
}
