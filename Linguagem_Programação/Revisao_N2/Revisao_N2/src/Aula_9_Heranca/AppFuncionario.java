package Aula_9_Heranca;

public class AppFuncionario {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("José da Silva",120,5.0);
        FuncionarioSenior fs = new FuncionarioSenior("Matheus Eli",120,5.0,2.0);
        
        
        System.out.println(f.toString());
        System.out.println(fs.toString());
    }
    
}
