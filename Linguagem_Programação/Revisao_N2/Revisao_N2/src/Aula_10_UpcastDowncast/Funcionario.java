package Aula_10_UpcastDowncast;

import Aula_9_Heranca.*;

public class Funcionario {
    
    private String nome;
    private int horastrabalhadas;
    private double valorhora;

    public Funcionario(String nome, int horastrabalhadas, double valorhora) {
        this.nome = nome;
        this.horastrabalhadas = horastrabalhadas;
        this.valorhora = valorhora;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    
    public double calcularSalario(){
    
        double salario;
        salario = horastrabalhadas*valorhora;
        
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", horastrabalhadas=" + horastrabalhadas + ", valorhora=" + valorhora + "\n"
                + "SALARIO: "+calcularSalario()+"}";
    }
    
    
}
