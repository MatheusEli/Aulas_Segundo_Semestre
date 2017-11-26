package Aula_9_Revisao;
public class FuncionariosSenior extends Funcionario{
    
    private int bonus;

    public FuncionariosSenior() {
    
        super();
    }
    
    public FuncionariosSenior(int bonus, String nome, double horasTrab, double valorHoras) {
        super(nome, horasTrab, valorHoras);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double salarioFinal(){
    
        double salariofinal = super.salarioFinal();
        double bonusP = ((super.salarioFinal()*bonus)/100);
        salariofinal += (bonusP*(super.getHorasTrab()/10));
        
        return salariofinal;
    }
    @Override
    public String imprimir(){
    
        return super.imprimir()+"\nBonus a cada 10 horas trabalhadas: "+bonus+"%";
    }
}
