
public class AppFuncionario {

    public static void main(String[] args) {
        
        Funcionario_Ex2 fu = new Funcionario_Ex2("Matheus Eli", 40, 5.00);
        FuncionarioSenior_Ex2 fus = new FuncionarioSenior_Ex2(20,"José da Silva",40,5.00);
        
        System.out.println(fu.imprimir());
        System.out.println(fus.imprimir());
    }
    
}
