package Aula_9_Revisao;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<Funcionario>listaFuncionarios = new ArrayList<>();

    public static ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static void setListaFuncionarios(ArrayList<Funcionario> listaFuncionarios) {
        Gerenciar.listaFuncionarios = listaFuncionarios;
    }
    public static void adicionarFuncionario(Funcionario funcionario){
    
        listaFuncionarios.add(funcionario);
    }
    public static String listar(){
    
        String saida = "";
        
        for (Funcionario funcionarios : listaFuncionarios) {
            
            saida += funcionarios.imprimir()+"\n";
        }
        return saida;
    }
    public static String listarSalarios(){
    
        String saida = "";
        
        for (Funcionario funcionarios : listaFuncionarios) {
            
            saida += "Nome: "+funcionarios.getNome()+" - Salario: "+funcionarios.salarioFinal()+"\n";
        }
        return saida;
    }
    public static int totalFuncionarioSenior(){
    
        int QtdSenior = 0;
        
        for (Funcionario funcionarios : listaFuncionarios) {
            
            if (funcionarios instanceof FuncionariosSenior) {
                
                QtdSenior ++;
            }
        }
        
        return QtdSenior;
    }
    public static String funcionarioMaiorBonus(){
    
        int maior = 0;
        String saida = "";
        
        for (Funcionario funcionarios : listaFuncionarios) {
            
            if (funcionarios instanceof FuncionariosSenior) {
                
                if (((FuncionariosSenior) funcionarios).getBonus() > maior) {
                    
                    maior = ((FuncionariosSenior) funcionarios).getBonus();
                }
                
                if (((FuncionariosSenior) funcionarios).getBonus() == maior) {
                    
                    saida = "Nome: "+funcionarios.getNome()+" - Bônus: "+((FuncionariosSenior) funcionarios).getBonus()+"%";
                }
            }
        }
        return saida;
    }
    public static String listarPorFaixaSlarial(double faixainicial, double faixafinal){
    
        String saida = "";
        for (Funcionario funcionarios : listaFuncionarios) {
            
            if (funcionarios.salarioFinal() >= faixainicial    &&    funcionarios.salarioFinal() <= faixafinal) {
                
                saida += "Nome: "+funcionarios.getNome()+" - Salário: "+funcionarios.salarioFinal()+"\n";
            }
        }
        return saida;
    }
}
