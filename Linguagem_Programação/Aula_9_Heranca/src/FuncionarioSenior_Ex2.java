public class FuncionarioSenior_Ex2 extends Funcionario_Ex2{

    private int bonus;
    
    public FuncionarioSenior_Ex2() {
    
        super();
    }
    
    public FuncionarioSenior_Ex2(int bonus, String nome, int horastrab, double valorhora) {
        super(nome, horastrab, valorhora);
        this.bonus = bonus;
    }
    
    
    @Override
    public double calcularSalario(){
    
        double salariofinal = super.calcularSalario();
        double bonusP = ((super.calcularSalario()*bonus)/100);
        
        salariofinal += bonusP*(super.getHorastrab()/10);
        
        return salariofinal;
    }
    
    @Override
    public String imprimir(){
        
        return super.imprimir()+"Bonus a cada 10 horas: "+bonus;
    }
}
