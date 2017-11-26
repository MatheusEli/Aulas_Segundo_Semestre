public class Gerente extends Funcionario {
    
    private int nFuncionarios;

    public Gerente() {
    
        super();
    }

    public Gerente(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    public Gerente(int nFuncionarios, String nome, double salario) {
        super(nome, salario);
        this.nFuncionarios = nFuncionarios;
    }

    public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }
    
    @Override
    public void aumentarSalario(double percentual){
    
        super.aumentarSalario(percentual+20);
    }
    
    @Override
    public String imprimir(){
    
        return super.imprimir()+"Número de Funcionarios que Gerencia: \n"+nFuncionarios;
    }
}
