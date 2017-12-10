
package Aula_10_UpcastDowncast;

import Aula_9_Heranca.*;

public class FuncionarioSenior extends Funcionario{
    
    private double bonus;

    public FuncionarioSenior() {
    
        super();
    }

    public FuncionarioSenior(String nome, int horastrabalhadas, double valorhora, double bonus) {
        super(nome, horastrabalhadas, valorhora);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
    
        double salario;
        double bonusTotal = 0;
        
        if ((super.getHorastrabalhadas()/10) > 0) {
            
            bonusTotal = (bonus*(super.getHorastrabalhadas()/10));
        }
        salario = ((super.getHorastrabalhadas()*super.getValorhora())+bonusTotal);
        
        return salario;
    }

    @Override
    public String toString() {
        return "FuncionarioSenior{" + "nome=" +super.getNome()+ ", horastrabalhadas=" +super.getHorastrabalhadas() + ", valorhora=" +super.getValorhora()+", Bonus="+bonus+"R$\n"
                + "SALARIO: "+calcularSalario()+"}";
    }
    
    
}
